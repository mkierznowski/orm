package orm.sql.creator;

import org.junit.Test;
import orm.data.entity.MojaKlasaTestowaRozszerzona;

import static org.junit.Assert.*;

public class SelectStatementTest {

    @Test
    public void buildSelectStatement() {
        assertEquals("SELECT * FROM mojaklasatestowarozszerzona WHERE id = \"asd\"",
                SelectStatement.getSelectSQL(MojaKlasaTestowaRozszerzona.class, "asd"));
    }
}