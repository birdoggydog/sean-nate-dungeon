package Inventory;

public class BodyLocationConstants {

	public static int HEAD_LOC = 0;
	public static int NECK_LOC = 1;
	public static int LEFT_EAR_LOC = 2;
	public static int RIGHT_EAR_LOC = 3;
	public static int LIPS_LOC = 4;
	public static int LEFT_EYE_LOC = 5;
	public static int RIGHT_EYE_LOC = 6;
	public static int LEFT_SHOULDER_LOC = 7;
	public static int RIGHT_SHOULDER_LOC = 8;
	public static int LEFT_UPPER_ARM_LOC = 9;
	public static int LEFT_LOWER_ARM_LOC = 10;
	public static int RIGHT_UPPER_ARM_LOC = 11;
	public static int RIGHT_LOWER_ARM_LOC = 12;
	public static int LEFT_WRIST_LOC = 13;
	public static int RIGHT_WRIST_LOC = 14;
	public static int LEFT_HAND_LOC = 13;
	public static int RIGHT_HAND_LOC = 14;
	public static int LEFT_FINGER_LOC = 15;
	public static int RIGHT_FINGER_LOC = 16;
	public static int TORSO_LOC = 17;
	public static int WAIST_LOC = 18;
	public static int LEFT_UPPER_LEG_LOC= 19;
	public static int RIGHT_UPPER_LEG_LOC= 20;
	public static int LEFT_LOWER_LEG_LOC= 21;
	public static int RIGHT_LOWER_LEG_LOC= 22;
	public static int LEFT_ANKLE_LOC= 23;
	public static int RIGHT_ANKLE_LOC= 24;
	public static int LEFT_FOOT_LOC= 25;
	public static int RIGHT_FOOT_LOC= 26;
	public static int BACK_LOC = 27;
	
	/**TODO: nathaniel
	 * 	we need to add in lists of valid locations here for each item type. 
	 * 
	 */
	int[] armorLocations = {HEAD_LOC,NECK_LOC,LEFT_SHOULDER_LOC,RIGHT_SHOULDER_LOC,LEFT_UPPER_ARM_LOC,RIGHT_UPPER_ARM_LOC,LEFT_LOWER_ARM_LOC,RIGHT_LOWER_ARM_LOC
			,LEFT_HAND_LOC,RIGHT_HAND_LOC,TORSO_LOC,LEFT_UPPER_LEG_LOC,RIGHT_UPPER_LEG_LOC,LEFT_LOWER_LEG_LOC,RIGHT_LOWER_LEG_LOC,LEFT_FOOT_LOC,RIGHT_FOOT_LOC,LEFT_HAND_LOC,RIGHT_HAND_LOC};
	int[] clothesLocations = {HEAD_LOC,NECK_LOC,LEFT_SHOULDER_LOC,RIGHT_SHOULDER_LOC,LEFT_UPPER_ARM_LOC,RIGHT_UPPER_ARM_LOC,LEFT_LOWER_ARM_LOC,RIGHT_LOWER_ARM_LOC
			,LEFT_HAND_LOC,RIGHT_HAND_LOC,TORSO_LOC,LEFT_UPPER_LEG_LOC,RIGHT_UPPER_LEG_LOC,LEFT_LOWER_LEG_LOC,RIGHT_LOWER_LEG_LOC,LEFT_FOOT_LOC,RIGHT_FOOT_LOC,WAIST_LOC,LEFT_ANKLE_LOC,RIGHT_ANKLE_LOC};
	int[] flairLocations= {LEFT_EYE_LOC,RIGHT_EYE_LOC,LEFT_EAR_LOC,RIGHT_EAR_LOC,RIGHT_WRIST_LOC,LEFT_WRIST_LOC,RIGHT_FINGER_LOC,LEFT_FINGER_LOC,RIGHT_ANKLE_LOC,LEFT_ANKLE_LOC,WAIST_LOC};
	int[] weaponsLocations = {LEFT_HAND_LOC,RIGHT_HAND_LOC,BACK_LOC};
}
