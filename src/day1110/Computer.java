package day1110;
/**
 * 
 * ������װ
 * @author QM
 *
 */
public abstract class Computer extends ComputerFactory 
{
	private String brand;//����Ʒ�ƣ�����,ƻ����
	private String name;//�����ͺţ�lenovo xx,apid xx,��
	private String size;//���Գߴ�(xxpx x xxpx)
	private String color;//������ɫ
	private String cpuName;//CPU�ͺ�
	private String emsName;//�ڴ��ͺ�
	private String harddiskName;//Ӳ���ͺ�
	private CPU cpu;//CPU����
	private EMS ems;//�ڴ泧��
	private HardDisk harddisk;//Ӳ�̳���
	
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
		System.out.println("����Ʒ���ǣ�"+brand);
		System.out.println("�����ͺ��ǣ�"+name);
		System.out.println("���Գߴ��ǣ�"+size);
		System.out.println("������ɫ�ǣ�"+color);
		System.out.println("���������ǣ�"+name);
		System.out.println("�����������ǣ�"+emsName+ cpuName+ harddiskName);		
	}	
}
