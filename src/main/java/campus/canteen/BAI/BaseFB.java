package campus.canteen.BAI;

public interface BaseFB<T> {

    int update(T t) ;

    int delete(int id) ;

    int insert(T t) ;


}
