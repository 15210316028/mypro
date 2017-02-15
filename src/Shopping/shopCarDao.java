package Shopping;

import java.util.*;

public interface shopCarDao
{
	boolean insert(shopCar shopCar) throws Exception;
	boolean delete(shopCar shopCar)throws Exception;
	boolean update(shopCar shopCar)throws Exception;
	boolean truncate(shopCar shopCar)throws Exception;
	List<Shop> selectAll()throws Exception;
}
