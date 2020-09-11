package LAb;
/**
 *This class implements my first application in Java
 * @author ß
 * @version 01
 * @since 2020.09.11
 * */
public class KT_LR_1_01 {

    public static void main(String[] args) {
    	/**
         *This method will output my name to the console
    	 *@param args Unused.
    	 *@return Nothing.
    	 * */
        System.out.println("Grop: 535st1");
        System.out.println("Srudent Krainiukov Andrei Dmitrievish");       
        System.out.println("Variant 8");
        
        String[] rar1= {
        "**        ***              ##              $$$$$$$$$$$$\n",
        "**      ***               ## ##            $$         $$\n",
        "**    ***                ##   ##           $$           $$\n",
        "**  ***                 ##     ##          $$            $$\n",
        "****                   ##       ##         $$            $$\n",
        "**  ***               #############        $$            $$\n",
        "**    ***            ##           ##       $$           $$\n",
        "**      ***         ##             ##      $$         $$\n",
        "**        ***      ##               ##     $$$$$$$$$$$\n "        		
        };
     
        for(int i= 0; i<rar1.length; i++) {
        	System.out.print(rar1[i]);
        };
    }
}
