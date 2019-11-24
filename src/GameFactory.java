import SGL2DANTLR.SGL2DBaseListener;
import SGL2DANTLR.SGL2DLexer;
import SGL2DANTLR.SGL2DParser;
import model.GenericGame;
import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class GameFactory {
    public GenericGame createGame (InputStream in) throws IOException {
        GenericGame genericGame = new GenericGame();

        // TODO: May have to do changes so it takes in the counter panel input or forwards it to another method call later
        SGL2DLexer lexer = new SGL2DLexer(CharStreams.fromStream(in));
        SGL2DParser parser = new SGL2DParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        final AtomicReference<String> name = new AtomicReference<>();
        final Map<String, Integer> points = new HashMap<>();
        final String[][] grid = new String[5][5];

        // TODO: Finish rest of the cases
        parser.addParseListener(new SGL2DBaseListener() {
            @Override
            public void exitEnvironment(SGL2DParser.EnvironmentContext ctx) {
                String xText = ctx.XINT().get(ctx.XINT().size() - 1).getText();
                String yText = ctx.YINT().get(ctx.YINT().size() - 1).getText();
                //genericGame.setRows(Integer.parseInt(xText.substring(2)));
                //genericGame.setColumns(Integer.parseInt(yText.substring(2)));
            }
            

        });
        parser.start();

        return genericGame;
    }
}
