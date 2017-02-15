package day1110;
/**
 * 
 * 电脑组装
 * @author QM
 *
 */
public abstract class Computer extends ComputerFactory 
{
	private String brand;//电脑品牌（联想,苹果）
	private String name;//电脑型号（lenovo xx,apid xx,）
	private String size;//电脑尺寸(xxpx x xxpx)
	private String color;//电脑颜色
	private String cpuName;//CPU型号
	private String emsName;//内存型号
	private String harddiskName;//硬盘型号
	private CPU cpu;//CPU厂商
	private EMS ems;//内存厂商
	private HardDisk harddisk;//硬盘厂商
	
	public String getCpuName() {
		return cpuName;
	}
	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}
	
	public String getEmsName() {
		return emsName;
	}
	public void setEmsName(String emsName) {
		this.emsName = emsName;
	}
	public String getHarddiskName() {
		return harddiskName;
	}
	public void setHarddiskName(String harddiskName) {
		this.harddiskName = harddiskName;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public EMS getEms() {
		return ems;
	}
	public void setEms(EMS ems) {
		this.ems = ems;
	}
	public HardDisk getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(HardDisk harddisk) {
		this.harddisk = harddisk;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void computer() {
		System.out.println("电脑品牌是："+brand);
		System.out.println("电脑型号是："+name);
		System.out.println("电脑尺寸是："+size);
		System.out.println("电脑颜色是："+color);
		System.out.println("电脑名称是："+name);
		System.out.println("电脑软件组成是："+emsName+ cpuName+ harddiskName);		
	}	
}
