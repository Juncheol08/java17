package sec1;

public class Member {
    private String id;
    private String pw;
    private String name;
    private String tel;
    private String email;
    private String birth;
    private int point;


    public Member() { // 기본 생성자
        this("kim");
    }

    public Member(String id) {
        this(id,"1234");
    }

    public Member(String id, String pw) {
        this(id,pw,"kitae");
    }

    public Member(String id, String pw, String name) {
        this(id,pw,name,"010-7358-2333");
    }

    public Member(String id, String pw, String name, String tel) {
        this(id,pw,name,tel,"qwe@naver.com");
    }

    public Member(String id, String pw, String name, String tel, String email) {
        this(id,pw,name,tel,email,"2001-07-14");
    }

    public Member(String id, String pw, String name, String tel, String email, String birth) {
        this(id,pw,name,tel,email,birth,100);
    }


    public Member(String id, String pw, String name, String tel, String email, String birth, int point) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
        this.email=email;
        this.birth = birth;
        this.point = point;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
