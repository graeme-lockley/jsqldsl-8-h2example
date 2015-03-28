package x.y.z;

import org.junit.Test;
import za.co.no9.jsqldsl.db.Query;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;


public class DepartmentTest {
    @Test
    public void should_show_simple_query() throws Exception {
        assertEquals(
                "SELECT d.ACTIVE, d.ID, d.NAME FROM DEPARTMENT AS d WHERE d.ID > 10 AND d.NAME IS NOT NULL",
                Query.from(DEPARTMENT.as("d"))
                        .where(d -> d.ID.gt(10).and(d.NAME.isNotNull()))
                        .select(d -> asList(d.ACTIVE, d.ID, d.NAME)).asString());
    }
}