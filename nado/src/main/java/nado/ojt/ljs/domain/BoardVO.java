package nado.ojt.ljs.domain;

public class BoardVO {
	private static final long serialVersionUID = 1L;

	/** 번호 */
	private int num;

	/** 제목 */
	private String title;

	/** 내용 */
	private String contents;

	/** 등록자 */
	private String writer;
	
	/** 암호 */
	private String password;
	
	/** 조회수 */
	private String view;
	
	/** 조회수 */
	private java.sql.Date date;
	
	/** 사용여부 */
	private char yn;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	public char getYn() {
		return yn;
	}

	public void setYn(char yn) {
		this.yn = yn;
	}
	
}
