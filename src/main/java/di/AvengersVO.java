package di;

public class AvengersVO {
	
	//멤버변수 
	private String name; //본명
	private String heroName; //히어로명
	private String ability; //능력
	private String age;  //나이
	
	//생성자(인자생성자)
	public AvengersVO(String name, String heroName, String ability, String age) {
		this.name = name;
		this.heroName = heroName;
		this.ability = ability;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getHeroName() {
		return heroName;
	}

	public String getAbility() {
		return ability;
	}

	public String getAge() {
		return age;
	}
			
			
}
