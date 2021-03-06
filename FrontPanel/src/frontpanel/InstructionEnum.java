
package frontpanel;


//defining constant for instructions according to their OpCode
public enum InstructionEnum {

	HALT("00"),
	LDR("01"),
	STR("02"),	
	//Load/Store Instructions
	LDA("03"),
	LDX("41"),	
	STX("42"),
	//Transfer Instructions
	JZ("10"),
	JNE("11"),
	JCC("12"),
	JMA("13"),
	JSR("14"),
	RFS("15"),
	SOB("16"),
	JGE("17"),		
	//Arithmetic and Logical Ops
	AMR("04"),
	SMR("05"),
	AIR("06"),
	SIR("07"),
	MLT("20"),//
	DVD("21"),
	TRR("22"),
	AND("23"),
	ORR("24"),
	NOT("25"),		
	SRC("31"),
	RRC("32"),
	//Floating Point/Vector Ops
	FADD("33"),
	FSUB("34"),
	VADD("35"),
	VSUB("36"),
	CNVRT("37"),
	LDFR("50"),
	STFR("51"),
	FAULT("999"),
	//Device Inst
	IN("61"),
	OUT("62"),
	CHK("63");
	
	
	
	
	private String value;
	
	InstructionEnum(String value){
		this.value = value;
	}
	
	public static InstructionEnum findInstruction(String value){
		switch(value){
			case "00":
				return HALT;
			case "01":
				return LDR;
			case "02":				
				return STR;
			case "03":
				return LDA;				
			case "04":
				return AMR;
			case "05":				
				return SMR;	
			case "06":				
				return AIR;	
			case "07":				
				return SIR;
			case "10":
				return JZ;
			case "11":
				return JNE;
			case "12":
				return JCC;
			case "13":
				return JMA;
			case "14":
				return JSR;
			case "15":
				return RFS;
			case "16":
				return SOB;
			case "17":
				return JGE;			
			case "20":
				return MLT;
			case "21":
				return DVD;
			case "22":
				return TRR;
			case "23":
				return AND;
			case "24":
				return ORR;
			case "25":
				return NOT;
			case "31":
				return SRC;
			case "32":
				return RRC;
			case "33":
				return FADD;
			case "34":
				return FSUB;
			case "35":
				return VADD;
			case "36":
				return VSUB;
			case "37":
				return CNVRT;
			case "41":
				return LDX;
			case "42":
				return STX;
			case "50":
				return LDFR;
			case "51":
				return STFR;
			case "61":
				return IN;
			case "62":
				return OUT;
			case "63":
				return CHK;
			default:
				return FAULT;
		}
	}
	
	public static String getValue(InstructionEnum instruction){ // define a getValue method.
            //System.out.println(instruction);
		String decimalValue = instruction.value;//give the instruction Value to decimalvalue;
		Integer firstPartN = Integer.parseInt(decimalValue.substring(0, 1));//return first part of the number as integer
		Integer secondPartN = Integer.parseInt(decimalValue.substring(1));//return secondPart of instruction to a integer.
                //System.out.println(firstPartN+" "+secondPartN);
		String firstPart = Integer.toBinaryString(firstPartN);//change it as a String 
		String secondPart = Integer.toBinaryString(secondPartN);//secondpart
		
		return BinaryUtil.fillBinaryStringParam(firstPart, 3) + BinaryUtil.fillBinaryStringParam(secondPart, 3);// return the length of first part plus second part
	}
	
}
