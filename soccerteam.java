public class SoccerTeam {

	Player[] player = new Player[11]; 
	Coach coach;
	/**
	 * This is the default constructors. 
	 * At most 11 player can play this team. 
	 * At most there are 4 roles players can have.
	 */
	private SoccerTeam() {
		 this.player = new Player[11]; 
	     this.coach = Coach.getInstance(); 
	}
	
	/**
	 * This is the overloaded constructor for this class
	 * @param player is an array containing all the players who entered the team.
	 * @param coach is the coach that trains the team's players.
	 */
	
	private SoccerTeam (Player [] player, Coach coach) {
		this.coach = Coach.getInstance(coach);
		this.player = new Player[player.length];
		for (int i = 0; i < player.length; i++) {
			this.player[i] = Player.getInstance(player[i]);
		}

	}
	
	/**
	 * This is the copy constructor for this class
	 * @param team is an object of SoccerTeam, whose component is deeply copied into 
	 * the component of this object.
	 */
	private SoccerTeam (SoccerTeam team) {
		this.coach = Coach.getInstance(team.coach);
		Player[] clone = new Player[this.player.length];
		for (int i = 0; i < this.player.length; i++) {
			clone[i] = Player.getInstance(team.player[i]);
		}
		this.player = clone;
	     
	}
	
	/**
	 * This is a static factory method
	 * @return IT returns an object of SoccerTeam
	 */
	public static SoccerTeam getInstance() {
		return new SoccerTeam();
	}
	/**
	 * This is a static factory method
	 * @param player is an array that contains players.
	 * @param coach is a coach of the team
	 * @return It returns an object of SoccerTeam made using the input parameters.
	 */
	public static SoccerTeam getInstance(Player [] player, Coach coach) {
		return new SoccerTeam(player, coach);
	}
	
	/**
	 * This is a static factory method
	 * @param team is an object of SoccerTeam
	 * @return it returns an object of SoccerTeam made using the input parameter. 
	 */
	public static SoccerTeam getInstance(SoccerTeam team) {
		return new SoccerTeam(team);
	}

	/**
	 * This is the getter method for the player list.
	 * @return returns an array containing all the players of this team. 
	 */
	public Player[] getPlayers() {
		Player[] clone = new Player[this.player.length];
		for (int i = 0; i < this.player.length; i++)
		{
			clone[i] = Player.getInstance(this.player[i]);
		}
		return clone;
	}
	
	/**
	 * This is the getter method for the coach attribute.
	 * @return Returns an object of coach containing all the components of this team's coach.
	 */

	public Coach getCoach() {
		return Coach.getInstance(this.coach);
	}
	
	/**
	 * This is the setter method for the player attribute, which deeply copies 
	 * the input parameter into the player attribute of this object. 
	 * @param player is an array of Player, whose elements are copied in the player attribute of this object.
	 */
	
	public void setPlayers(Player [] player) {
		Player[] clone = new Player[player.length];
		for (int i = 0; i < player.length; i++) {
			clone[i] = Player.getInstance(player[i]);
		}
		this.player = clone;
	}
	
	/**
	 * This is the setter method for the coach attribute, which deeply copies 
	 * the input parameter into the coach attribute of this object.
	 * @param coach is an object of Coach, whose attributes are copied in the coach attribute of this object.
	 */
	public void setCoach(Coach coach) {
		this.coach = Coach.getInstance(coach);
	}

}

/**
 * 
 * This class implements all a player requires to play in this team. 
 * A player has a number, a name, and a role. A role can be either defense, central, striker, or goal keeper. 
 * these roles can be represented by the characters 'd', 'c', 's', or 'g'
 *
 */
class Player {
	private int num;
	private String name;
	private char role;
	
	/**
	 * This is the overloaded constructor for this class
	 * @param num
	 * @param name
	 * @param role
	 * 
	 * 
	 */
	
	private Player() {
	}
	
	private Player(int num, String name, char role) {
		this.name = name;
		this.num = num;
		this.role = role;
	}

	
	/**
	 * This is the copy constructor for this class
	 * @param player
	 */
	private Player(Player player) {
		this.name = new String(player.name);
		this.role = player.role;
		this.num = player.num;
	
	}
	
	/**
	 * This is a static factory method.
	 * @return It returns an object of Player
	 */
	public static Player getInstance() {
		return new Player();
	}
	
	/**
	 * This is a static factory method
	 * @param num is the player number
	 * @param name is the name of player
	 * @param role is the role of the player in the team
	 * @return It returns an object of player, which is made by the two input variables. 
	 */
	public static Player getInstance(int num, String name, char role) {
		return new Player(num, name, role);
	}
	
	/**
	 * This is a static factory method
	 * @param player is an object of player
	 * @return it returns an object of player that is made using the input parameter. 
	 */
	public static Player getInstance(Player player) {
		return new Player(player);
	}

	/**
	 * This is the getter method for attribute name
	 * @return returns the value of attribute name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * This is the getter method for attribute role
	 * @return returns the reference to attribute role.
	 */
	public char getRole() {
		return this.role;
	}
	
	public int getNum() {
		return this.num;
	}
	
	
	/**
	 * This is the setter method for attribute name
	 * @param name is the value that is used to initialize name attribute
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This is the setter method for attribute role
	 * @param role is the object, whose reference is used to initialize attribute role.
	 */
	public void setRole(char role) {
		 this.role = role;
	}
	
}

/**
 * This class represent the coach that trains the team's players.
 * A coach has a name, a number of years of experience, and a level of expertise. 
 * The level of expertise can be represented by one of the strings: "high", "average", or "beginner".
 */
class Coach{
	
	/**
	 * This is the overloaded constructor.
	 * @param name is the name of the coach.
	 * @param yearsExp is the number of years of experience of the coach.
	 * @param level is the level of experience of the coach.
	 */
	private String name;
	private int yearsExp;
	private String level; 
	
	private Coach(String name, int yearsExp, String level) {
		this.name = name;
		this.yearsExp = yearsExp;
		this.level = level;
	}
	
	/**
	 * This is a static factory method that initializes the attributes to their default values. 
	 * @return It returns an Coach object.
	 */
	public static Coach getInstance() {
		return new Coach("", 0,"");
	}
	
	/**
	 * This is a static factory method
	 * @param name is the name of the coach.
	 * @param yearsExp is the number of years of experience of the coach.
	 * @param level is the level of experience of the coach.
	 * @return it returns a Coach object.
	 */
	public static Coach getInstance(String name, int yearsExp, String level) {
		return new Coach(name, yearsExp, level);
	}
	
	/**
	 * This is the copy constructor.
	 * @param coach is an object of Coach that is used to initialize this object.
	 */
	private Coach(Coach coach) {
		this.name = new String(coach.name);
		this.yearsExp = coach.yearsExp;
		this.level = coach.level;
	}
	
	public static Coach getInstance(Coach coach) {
		return new Coach(coach);
	}
	
	public String getName() {
		return new String(this.name);

	}
	public int getYearsExp() {
		return this.yearsExp;

	}
	public String getLevel() {
		return new String(this.level);
	}
}
