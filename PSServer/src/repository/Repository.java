package repository;

import java.util.List;

/**
 *
 * @author Cartman
 * @param <T>
 */
public interface Repository<T> {
    List<T> getAll(T param) throws Exception;
    T addAndReturn(T param) throws Exception;
    int add(T param) throws Exception;
    int edit(T param) throws Exception;
    int delete(T param)throws Exception;
    List<T> getAll();
}
