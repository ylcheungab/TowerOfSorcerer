package testing;

import java.io.*;
import java.util.ArrayList;

import items.*;
import map.Map;
import misc.Misc;


public class TestItemsMap {
	
	public static String getInput(){
		String line = "";
		System.out.print("Enter the prompt: ");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return line;
	}
	
	public static String getcontent(String p){
		if(p.startsWith("post"))
			return p.substring(5);
		else if(p.startsWith("delete"))
			return p.substring(7);
		else 
			return p;
	}
	
	public static void main(String[] args){
		String prompt = null;
		Map firstfloor = new Map("Floor 1", 1);
		ItemGroup group = new ItemGroup();
		Misc misc = new Misc();
		
		while(!(prompt = TestItemsMap.getInput()).equals("exit")){
			if (prompt.startsWith("list")){
				if (prompt.startsWith("listfloor"))
					System.out.println(firstfloor);
				else if (prompt.startsWith("listitem"))
					System.out.println(group);
			}
			else if (prompt.startsWith("additem"))
				group.addItem(new Items("ground", "000.pic", false, misc.randGen(),
						new ArrayList<Integer>(0), "ground"));
			else if (prompt.startsWith("set")){
				int index;
				index = Integer.parseInt(prompt = TestItemsMap.getInput());
				firstfloor.setMapping(group, group.getItem(0), index, index);
			}else
				System.out.println("Error message. Logout please type 'exit'.");
		}
	}
}
