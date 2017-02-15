package Shopping;

import java.util.*;

public interface shopCarService
{
	boolean add(shopCar shopCar) ;
	boolean remove(shopCar shopCar);
	boolean exit(shopCar shopCar);
	boolean clear(shopCar shopCar);
	List<Shop> queryAll();
}
