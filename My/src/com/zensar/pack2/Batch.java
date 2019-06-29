package com.zensar.pack2;

public class Batch {

	 private String  courseName;
	 private int batchStrength;
	 
	public Batch(String courseName, int batchStrength) {
		super();
		this.courseName = courseName;
		this.batchStrength = batchStrength;
	}
	public Batch() {
		super();
	}
	 
	public void displayBatch() {
		System.out.println("Strength for batch "+this.courseName+"\t is "+this.batchStrength);
	}
	 
	public static void fun() {
		System.out.println("\t \t Do or Do Not There is No Try");
		System.out.println("                            ____                  \r\n" + 
				"                            _.' :  `._               \r\n" + 
				"                        .-.'`.  ;   .'`.-.           \r\n" + 
				"               __      / : ___\\ ;  /___ ; \\      __  \r\n" + 
				"             ,'_ \"\"=-.:__;\".-.\";: :\".-.\":__;.-=\"\" _`,\r\n" + 
				"             :' `.t\"\"=-.. '<@.`;_  ',@:` ..-=\"\"j.' `;\r\n" + 
				"                  `:-.._J '-.-'L__ `-.-' L_..-;'     \r\n" + 
				"                    \"-.__ ;  .-\"  \"-.  : __.-\"       \r\n" + 
				"                        L ' /.======.\\ ' J           \r\n" + 
				"                         \"-.   \"__\"   .-\"            \r\n" + 
				"                        __.l\"-:_JL_;-\";.__           \r\n" + 
				"                     .-j/'.;  ;\"\"\"\"  / .'\\\"-.        \r\n" + 
				"                   .' /:`. \"-.:     .-\" .';  `.      \r\n" + 
				"                .-\"  / ;  \"-. \"-..-\" .-\"  :    \"-.   \r\n" + 
				"             .+\"-.  : :      \"-.__.-\"      ;-._   \\  \r\n" + 
				"             ; \\  `.; ;                    : : \"+. ; \r\n" + 
				"             :  ;   ; ;                    : ;  : \\: \r\n" + 
				"             ;  :   ; :                    ;:   ;  : \r\n" + 
				"            : \\  ;  :  ;                  : ;  /  :: \r\n" + 
				"            ;  ; :   ; :                  ;   :   ;: \r\n" + 
				"            :  :  ;  :  ;                : :  ;  : ; \r\n" + 
				"            ;\\    :   ; :                ; ;     ; ; \r\n" + 
				"            : `.\"-;   :  ;              :  ;    /  ; \r\n" + 
				"             ;    -:   ; :              ;  : .-\"   : \r\n" + 
				"             :\\     \\  :  ;            : \\.-\"      : \r\n" + 
				"              ;`.    \\  ; :            ;.'_..-=  / ; \r\n" + 
				"              :  \"-.  \"-:  ;          :/.\"      .'  :\r\n" + 
				"               \\         \\ :          ;/  __        :\r\n" + 
				"                \\       .-`.\\        /t-\"\"  \":-+.   :\r\n" + 
				"                 `.  .-\"    `l    __/ /`. :  ; ; \\  ;\r\n" + 
				"                   \\   .-\" .-\"-.-\"  .' .'j \\  /   ;/ \r\n" + 
				"                    \\ / .-\"   /.     .'.' ;_:'    ;  \r\n" + 
				"                     :-\"\"-.`./-.'     /    `.___.'   \r\n" + 
				"                           \\ `t  ._  /               \r\n" + 
				"                            \"-.t-._:'                ");
	}
}
