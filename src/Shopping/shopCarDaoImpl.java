package Shopping;
import java.sql.*;
import java.util.*;
public class shopCarDaoImpl implements shopCarDao {
	public boolean insert(shopCar shopCar) throws Exception {
		BaseDao bd=BaseDao.getIntance();
		Connection con=bd.getConnection();		
		String sql="insert into shopcar (sid,sname,scount,random)  values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		String[] s=new String[4];		
		s[0]=String.valueOf(shopCar.getSid());
		s[1]=shopCar.getSname();
		s[2]=String.valueOf(shopCar.getScount());
		s[3]=String.valueOf(shopCar.getMoney());
		for(int i=0;i<s.length;i++)
		{
			ps.setObject(i+1, s[3]);
		}
		int num=ps.executeUpdate();
		if(num>0)
		{
			bd.closeAll(con, ps, null, null);
			return true;
		}
		else
		{
			bd.closeAll(con, ps, null, null);
			return false;
		}		
	}	
	public boolean delete(shopCar shopCar) throws Exception {
		BaseDao bd=BaseDao.getIntance();
		Connection con=bd.getConnection();		
		String sql="delete  from shopcar where name=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, String.valueOf(shopCar.getScount()));
		int num=ps.executeUpdate();
		if(num>0)
		{
			bd.closeAll(con, ps, null, null);
			return true;
		}
		else
		{
			bd.closeAll(con, ps, null, null);
			return false;
		}		
	}
	public boolean update(shopCar shopCar) throws Exception {
		BaseDao bd=BaseDao.getIntance();
		Connection con=bd.getConnection();		
		String sql="update scount=? set shopcar where name=?";
		PreparedStatement ps=con.prepareStatement(sql);
		String[] s=new String[2];
		s[0]=String.valueOf(shopCar.getScount());
		s[1]=shopCar.getSname();
		int num=ps.executeUpdate();
		if(num>0)
		{
			bd.closeAll(con, ps, null, null);
			return true;
		}
		else
		{
			bd.closeAll(con, ps, null, null);
			return false;
		}
	}
	public List<Shop> selectAll() throws Exception {
		BaseDao bd=BaseDao.getIntance();
		Connection con=bd.getConnection();
		String sql="select * from shop";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Shop> ls=new ArrayList<Shop>();	
		Shop shop;
		while(rs.next())
		{			
			shop=new Shop();
			shop.setId(rs.getInt("id"));
			shop.setName(rs.getString("name"));
			shop.setCount(rs.getInt("count"));
			shop.setPrice(rs.getDouble("price"));
			ls.add(shop);						
		}
		bd.closeAll(con, ps, null, rs);
		return ls;
	}
	public List selectShop(int id) throws Exception
	{		
		BaseDao bd=BaseDao.getIntance();
		Connection con=bd.getConnection();
		String sql="select count,name from shop where id=?";
		PreparedStatement ps=con.prepareStatement(sql);		
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();	
		List<Shop> ls=new ArrayList<Shop>();
		if(rs.next())
		{
			Shop s = new Shop();
			s.setCount(rs.getInt("count"));			
			ls.add(s);
		}
		bd.closeAll(con, ps, null, rs);
		return ls;
	}
	public boolean truncate(shopCar shopCar) throws Exception {		
		BaseDao bd=BaseDao.getIntance();
		Connection con=bd.getConnection();		
		String sql="truncate table shopcar";
		PreparedStatement ps=con.prepareStatement(sql);		
		int num=ps.executeUpdate();
		if(num>0)
		{
			bd.closeAll(con, ps, null, null);
			return true;
		}
		else
		{
			bd.closeAll(con, ps, null, null);
			return false;
		}
	}
}
