package Chapter07;

// 타입파라미터 2개 (멀티타입 파라미터)
public class Product<T, M> {
	
	// 필드 
	private T kind;
	private  M model;
	
	// 게터
	public T getKind() { return kind; }
	public M getModel() { return model; }
	
	// 세터
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }
	
}
