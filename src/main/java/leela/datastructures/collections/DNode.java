package leela.datastructures.collections;

public class DNode {
	int data;
	DNode pNode;
	DNode nNode;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DNode getpNode() {
		return pNode;
	}
	public void setpNode(DNode pNode) {
		this.pNode = pNode;
	}
	public DNode getnNode() {
		return nNode;
	}
	public void setnNode(DNode newNode) {
		this.nNode = newNode;
	}
	
	

}
