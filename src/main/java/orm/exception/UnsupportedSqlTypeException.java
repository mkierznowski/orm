package orm.exception;

public class UnsupportedSqlTypeException extends SharedDatabaseException {

    public UnsupportedSqlTypeException(){
        super("a class contains not supported class composition");
    }
}
