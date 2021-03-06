import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

//Falta en la gramatica el poder hacer ID.ID

public class MyVisitor<T> extends PsicoderBaseVisitor<T> {

    private ArrayList<HashMap> simbolos = new ArrayList<>(); //Tabla de simbolos general, en la cual estaran los imbolos del programa principal y sus scopes
    private HashMap<String, PsicoderParser.FuncionContext> functions = new HashMap<>(); //hash que contendra las funciones declaradas por encima del la funcion principal
    private HashMap<String, PsicoderParser.EstructuraContext> estructuras = new HashMap<>(); //hash que contendra las estructuras declaradas por encima del la funcion principal
    private String idEstruct = null; //Variable que contendra el id de la estructura actual que ha sido declarada
    private HashMap<String, Object> hashTemp = null; //tabla de simbolosde la función que ha sido llamada recientemente, se declara como null para ayudar con la comparación de is esta o no en una función
    private final String NOASIGNADO = "je/4NmP-c$Kj34#_Z[[.wbb:R{Cr4beLw%K+@=QUzh=L6LcPde"; //Este valor se asignara a las variables que no sean declaradas pero no se les asigne ningun valor

    @Override
    public T visitS(PsicoderParser.SContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitFuncion_principal(PsicoderParser.Funcion_principalContext ctx){
        simbolos.add(new HashMap<>());
        visitComandos(ctx.comandos());
        simbolos.remove(simbolos.size()-1);
        return null;
    }

    @Override
    public T visitFuncion(PsicoderParser.FuncionContext ctx) {

        String id = ctx.ID().getText();

        if(functions.get(id) != null)
            System.out.println("Ese nombre de funcion ya existe");

        functions.put( id, ctx );

        return null;
    }

    @Override
    public T visitRetornar(PsicoderParser.RetornarContext ctx) {
        return visitExpr( ctx.expr() );
    }

    @Override
    public T visitParametros(PsicoderParser.ParametrosContext ctx) {

        ArrayList<String> parametros = new ArrayList<>();

        if( ctx.tipo() != null ) {

            int i = 0;

            while (ctx.tipo(i) != null) {

                parametros.add(ctx.ID(i).getText() + " " + visitTipo(ctx.tipo(i)));
                i += 1;

            }
        }

        return (T)parametros;
    }

    @Override
    public T visitEstructura(PsicoderParser.EstructuraContext ctx) {

        String id = ctx.ID().getText();

        if( estructuras.get(id) != null )
            System.out.println("Esa estructura ya ha sido declarada");

        estructuras.put( id, ctx );

        return null;
    }

    @Override
    public T visitDeclaracion(PsicoderParser.DeclaracionContext ctx) {

        if( ctx.tipo().ID() != null ){ //Si la asignacion es una estructura, si es estructura se salta la parte de asignación

            String id = ctx.tipo().ID().getText(); //Obtenemos el identificador
            PsicoderParser.EstructuraContext estructuraCtx = estructuras.get( id ); //Obtenemos el ctx guardado en la declaración de la estructura

            idEstruct = ( idEstruct != null ? idEstruct + "." + id : id ); //Cambiamos la variable global que nos dira en que estructura se esta, permite estrcturas anidadas
            int i = 0; //Contador para mirar multiples declaraciones
            while( estructuraCtx.declaracion(i) != null )
                visitDeclaracion( estructuraCtx.declaracion(i) ); //Realizamos la declaricón correspondiente

            idEstruct = null;
        } else {

            String tipo = (String) visitTipo(ctx.tipo()); //recogemos el tipo de dato que se va a asignar

            int i = 0; //Contador para mirar multiples id's en una misma linea
            while (ctx.ID(i) != null) {
                String id = ctx.ID(i).getText();
                Object asig = visitAsignacion(ctx.asignacion(i)); //obtenemos el valor de la asignación a dicho identificador

                String asigTipo = asig.getClass().getSimpleName();

                if (asig != NOASIGNADO && asigTipo != tipo) //Revisamos que en caso de haber sido asignado algun valor los tipos correspondan
                    System.out.println("Mala asignación, no es posible asignar " + asigTipo + " a una variable tipo " + tipo);

                String idAGuardar = (idEstruct != null ? idEstruct + "." + id : id); //Identificador que sera guardado en la tabla de simbolos permitiendo estructuras

                simbolos.get(simbolos.size() - 1).put(idAGuardar, asig); //Guardamos el simbolo con su valor en la ultima posicion del array (ultimo scope)
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public T visitAsignacion(PsicoderParser.AsignacionContext ctx) {

        if( ctx.expr() != null )
            return visitExpr( ctx.expr() );

        return (T)NOASIGNADO; //retornamos el valor de no asignado
    }

    @Override
    public T visitComandos(PsicoderParser.ComandosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitComando(PsicoderParser.ComandoContext ctx) {
        if( ctx.imprimir() != null){
            System.out.println("asd");
            visitImprimir( ctx.imprimir() );
        } else if( ctx.leer() != null ){
            visitLeer(ctx.leer());
        } else if( ctx.llamar_funcion() != null ){
            visitLlamar_funcion( ctx.llamar_funcion() );
        } else if( ctx.declaracion() != null ){
            visitDeclaracion( ctx.declaracion() );
        }
        return visitChildren(ctx);
    }

    @Override public T visitSi(PsicoderParser.SiContext ctx) { return visitChildren(ctx); }

    @Override public T visitSi_no(PsicoderParser.Si_noContext ctx) { return visitChildren(ctx); }

    @Override public T visitPara(PsicoderParser.ParaContext ctx) { return visitChildren(ctx); }

    @Override public T visitAsignacion_entero(PsicoderParser.Asignacion_enteroContext ctx) { return visitChildren(ctx); }

    @Override public T visitHacer_mientras(PsicoderParser.Hacer_mientrasContext ctx) { return visitChildren(ctx); }

    @Override public T visitMientras(PsicoderParser.MientrasContext ctx) { return visitChildren(ctx); }

    @Override public T visitSeleccionar(PsicoderParser.SeleccionarContext ctx) { return visitChildren(ctx); }

    @Override public T visitCasos(PsicoderParser.CasosContext ctx) { return visitChildren(ctx); }

    @Override public T visitCaso(PsicoderParser.CasoContext ctx) { return visitChildren(ctx); }

    @Override public T visitAsignacion_id(PsicoderParser.Asignacion_idContext ctx) { return visitChildren(ctx); }

    @Override
    public T visitLeer(PsicoderParser.LeerContext ctx) {



        return visitChildren(ctx);
    }

    @Override
    public T visitImprimir(PsicoderParser.ImprimirContext ctx) {
        System.out.println( "Estamos en imprimir" );
        System.out.println( visitChildren(ctx) + "Estamos en imprimir" ); //Lo de visit children
        return null;
    }

    @Override public T visitRomper(PsicoderParser.RomperContext ctx) { return visitChildren(ctx); }

    @Override
    public T visitLlamar_funcion(PsicoderParser.Llamar_funcionContext ctx) {

        hashTemp = new HashMap<>(); //Este sera un nuevo hash temporal en el cual se guardaran los parametros y todas las variables de los comandos

        String id = ctx.ID().getText();

        if( functions.get(id) == null ) //Revisa que la función ya se halla declarado
            System.out.println("Esa funcion no ha sido declarada aun");

        PsicoderParser.FuncionContext functionCtx = functions.get(id);

        ArrayList<Object> llamarFuncionParametros = (ArrayList<Object>) visitPasar_parametros(ctx.pasar_parametros()); //retorna los parametros pasados al llamar funcion
        ArrayList<String> parametros = (ArrayList<String>) visitParametros(functionCtx.parametros()); //Retorna las variables declaradas como parametros en la declaracion de la función

        if( llamarFuncionParametros.size() < parametros.size() ) //Compara la cantidad de parametros con la cantidad que se ingresaron al llamar a f
            System.out.println("Faltan parametros por pasar en la funcion");
        else if( llamarFuncionParametros.size() > parametros.size() )
            System.out.println("Se han ingresado mas parametros de los requeridos al llamar la funcion");

        for( int i=0; i<parametros.size(); i++ ) {

            String[] parametrosSplit = parametros.get(i).split(" "); //La forma en que se ha guardado el string es "id tipo"
            String tipoParametro = llamarFuncionParametros.get(i).getClass().getName();

            if( parametrosSplit[1] != tipoParametro ) //Comprobamos que efectivamente los tipos de datos del parametro correspondan
                System.out.println("El parametro " + i + " no concuerda requiere un tipo" + tipoParametro );

            hashTemp.put(parametrosSplit[0], llamarFuncionParametros.get(i));
        }

        visitComandos( functionCtx.comandos() ); //Aca el solo deberia tener acceso a el objeto hashTemp

        Object valorRetornado = visitRetornar( functionCtx.retornar() ); //Aca el solo eberia tener acceso a el objeto hashTemp

        if( visitTipo(functionCtx.tipo()) != valorRetornado.getClass().getSimpleName() ) //Compara si coincide lo que retorna con el tipo de funcion
            System.out.println("El valor de retorno no es equivalente al tipo que deberia retornar");

        hashTemp = null; //Se devuelve hashTemp a null para que en comandos se pueda mirar si se esta dentro de una funcion o no

        return (T)valorRetornado; //Si para todos los casos retorna el valor ede la expr en retorno
    }

    @Override
    public T visitPasar_parametros(PsicoderParser.Pasar_parametrosContext ctx) {

        ArrayList<Object> parametros = new ArrayList<>();

        if( ctx.expr() != null ){

            int i=0;

            while( ctx.expr(i) != null ){

                parametros.add( visitExpr( ctx.expr(i) ) );
                i+=1;
            }
        }

        return (T)parametros;
    }

    @Override
    public T visitExpresion_logica(PsicoderParser.Expresion_logicaContext ctx) {
        if( ctx.expresion_logica() != null ) {
            System.out.println("expresion_logica");
            String op = ctx.ROL().getText();

            Object expr1 = visitExpresion_logica(ctx.expresion_logica(0));
            Object expr2 = visitExpresion_logica(ctx.expresion_logica(1));

            String tipoExpr1 = expr1.getClass().getSimpleName();
            String tipoExpr2 = expr2.getClass().getSimpleName();

            if ( tipoExpr1 != "Boolean" || tipoExpr2 != "Boolean"  ){
                System.out.println("Mala expresion uno de los tipos no es booleano en && ||");
            }

            Boolean ans = null;

            switch (op){
                case "&&":
                    ans = (Boolean)expr1 && (Boolean)expr2;
                    break;
                case "||":
                    ans = (Boolean)expr1 || (Boolean)expr2;
                    break;
            }

            return (T)ans;
        } else if(ctx.expresion_rop() != null){
            System.out.println("expresion_rop");
            return visitExpresion_rop(ctx.expresion_rop());
        } else if(ctx.expresion_roi() != null){
            System.out.println("expresion_roi");
            return visitExpresion_roi(ctx.expresion_roi());
        } else if(ctx.NEG().getText() != null){
            System.out.println("expresion_logica");
            Boolean expr = (Boolean)visitExpresion_logica(ctx.expresion_logica(0));
            return (T)(Boolean)!expr;
        } else{
            System.out.println("Hola mundo cruel");
            return visitExpr(ctx.expr());
        }
    }

    @Override
    public T visitExpresion_rop(PsicoderParser.Expresion_ropContext ctx) {

        String op = ctx.ROP().getText();

        Object expr1 = visitExpr(ctx.expr(0));
        Object expr2 = visitExpr(ctx.expr(1));

        String tipoExpr1 = expr1.getClass().getSimpleName();
        String tipoExpr2 = expr2.getClass().getSimpleName();

        if ( tipoExpr1 != "Integer" && tipoExpr1 != "Double" || tipoExpr2 != "Integer" && tipoExpr2 != "Double"  ){
            System.out.println("Error en Expresion_rop una de las expresiones no se puede comparar");
        }

        Boolean ans = null;

        switch (op){
            case "<":
                ans = (Double)expr1 < (Double)expr2;
                break;
            case ">":
                ans = (Double)expr1 > (Double)expr2;
                break;
            case "<=":
                ans = (Double)expr1 <= (Double)expr2;
                break;
            case ">=":
                ans = (Double)expr1 >= (Double)expr2;
                break;
        }

        return (T)ans;
    }

    @Override
    public T visitExpresion_roi(PsicoderParser.Expresion_roiContext ctx) {

        String op = ctx.ROI().getText();

        Object expr1 = visitExpr(ctx.expr(0));
        Object expr2 = visitExpr(ctx.expr(1));

        Boolean ans = null;

        switch (op){
            case "==":
                ans = (expr1 == expr2);
                break;
            case "!=":
                ans = (expr1 != expr2);
                break;
        }

        return (T)ans;
    }

    @Override
    public T visitExpr(PsicoderParser.ExprContext ctx) {
        //System.out.println(ctx);
        if( ctx.DOUBLE() != null ){
            System.out.println(ctx.DOUBLE().getText()+"DOUBLE");
            Double numero = Double.valueOf(ctx.DOUBLE().getText());
            System.out.println(numero+" DOUBLE");
            return (T)numero;
        } else if( ctx.INT() != null ){
            System.out.println(ctx.INT().getText()+"INT");
            Integer numero = new Integer(ctx.INT().getText());
            return (T)numero;
        } else if( ctx.CONST() != null ){
            System.out.println(ctx.CONST().getText()+"CONST");
            Character caracter = new Character(ctx.CONST().getText().charAt(0));
            return (T)caracter;
        } else if( ctx.STRING() != null ){
            System.out.println(ctx.STRING().getText()+"String");
            String cadena = new String(ctx.STRING().getText());
            return (T)cadena;
        } else if( ctx.BOOLEANO() != null ){
            System.out.println(ctx.BOOLEANO().getText()+"BOOLEANO");
            Boolean booleano = new Boolean(ctx.BOOLEANO().getText());
            return (T)booleano;
        } else if( ctx.ID() != null ){
            System.out.println( "Dentro de visitExpr en la parte de ID " );
            String id = ctx.ID().getText();
            Object value = getObjectId( id );
            return (T)value;
        } else if( ctx.PIZQ() != null ){
            System.out.println( "Dentro de visitExpr en la parte de '(' " );
            return visitExpr(ctx.expr(0));
        } else {

            System.out.println( "Dentro de visitExpr en la parte de expr (MULOP|SUMOP) " );

            String op = (ctx.MULOP() != null ? ctx.MULOP().getText() : ctx.SUMOP().getText());
            System.out.println( "Dentro de visitExpr en la parte de expr (MULOP|SUMOP) " +  op);

            Object expr1 = visitExpr(ctx.expr(0));
            Object expr2 = visitExpr(ctx.expr(1));

            String tipoExpr1 = expr1.getClass().getSimpleName();
            String tipoExpr2 = expr2.getClass().getSimpleName();

            if( tipoExpr1 == "String" && tipoExpr2 == "String" )
                if( op != "+" )
                    System.out.println("Error semantico en expresion, no se puede (restar | dividir | mult) string con string");
                else
                    return (T)((String)expr1 + (String)expr2);

            Double ans = null;

            if( tipoExpr1 == "Boolean" )
                expr1 = new Integer((Boolean) expr1 ? 1 : 0);
            else if( tipoExpr1 == "Character" )
                expr1 = new Integer((int)(Character)expr1);

            if( tipoExpr2 == "Boolean" )
                expr2 = new Integer((Boolean) expr2 == true ? 1 : 0);
            else if( tipoExpr1 == "Character" )
                expr2 = new Integer((int)(Character)expr2);

            switch (op){
                case "*":
                    return (T)(Object)((tipoExpr1 == "Double" ? new Double((Double)expr1) : new Integer((Integer)expr1)) * (tipoExpr1 == "Double" ? new Double((Double)expr2) : new Integer((Integer)expr2)));
                    //break;
                case "/":
                    return (T)(Object)((tipoExpr1 == "Double" ? new Double((Double)expr1) : new Integer((Integer)expr1)) / (tipoExpr1 == "Double" ? new Double((Double)expr2) : new Integer((Integer)expr2)));
                    //ans = (Double)expr1 / (Double)expr2;
                    //break;
                case "%":
                    return (T)(Object)((tipoExpr1 == "Double" ? new Double((Double)expr1) : new Integer((Integer)expr1)) % (tipoExpr1 == "Double" ? new Double((Double)expr2) : new Integer((Integer)expr2)));
                    //ans = (Double)expr1 % (Double)expr2;
                    //break;
                case "**": //Por desarrollar
                    //ans = Math.pow( (Double)expr1, (Double)expr2 );
                    //break;
                case "+":
                    return (T)(Object)((tipoExpr1 == "Double" ? new Double((Double)expr1) : new Integer((Integer)expr1)) + (tipoExpr1 == "Double" ? new Double((Double)expr2) : new Integer((Integer)expr2)));
                    //ans = (Double)expr1 + (Double)expr2;
                    //break;
                case "-":
                    return (T)(Object)((tipoExpr1 == "Double" ? new Double((Double)expr1) : new Integer((Integer)expr1)) - (tipoExpr1 == "Double" ? new Double((Double)expr2) : new Integer((Integer)expr2)));
                    //ans = (Double)expr1 - (Double)expr2;
                    //break;
            }
            return (T)ans;
        }
        //return null;
    }

    @Override
    public T visitTipo(PsicoderParser.TipoContext ctx) {
        return visitChildren(ctx);
    }

    private Object getObjectId( String id ){

        Object value = null;

        for( int i=0; i<simbolos.size(); i++){
            if( simbolos.get(i).get(id) != null )
                value = simbolos.get(i).get(id);
            if( hashTemp.get( id ) != null )
                value = hashTemp.get(id);
        }

        if( value == null ) {
            System.out.println("El identificador no ha sido declarado");
            //System.exit(-1);
        }

        return value;
    }

}
