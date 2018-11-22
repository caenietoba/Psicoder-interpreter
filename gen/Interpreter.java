import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interpreter {

    public static void main(String [] args) throws  Exception {
        System.setIn(new FileInputStream(new File("input.txt")));
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        PsicoderLexer lexer = new PsicoderLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PsicoderParser parser = new PsicoderParser(tokens);
        ParseTree tree = parser.s();

        MyVisitor<Object> loader = new MyVisitor<Object>();
        loader.visit(tree);
    }
}
