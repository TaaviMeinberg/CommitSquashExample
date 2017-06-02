import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poem {

	public boolean hasWord(String[] poem, String specificWord) {
		
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			
			if (Arrays.asList(parts).contains(specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				return true;
			}
		}
		return false;
	}
	
	public int countWord(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		int howManyTimesAppeared = 0;
		
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (Arrays.asList(parts).contains(specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				howManyTimesAppeared++;
			}
		}
		return howManyTimesAppeared;
	}
	
	public int firstAppear(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		int rowBeingChecked = 0;
		
		for (String string : poem) {
			rowBeingChecked++;
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (Arrays.asList(parts).contains(specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				
				return rowBeingChecked;
			}
		}
		return rowBeingChecked;
	}
	
	public List<Integer> appearedRows(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = deCapitalize(specificWord);
		List<Integer> NumberOfRows = new ArrayList<Integer>();
		int rowNumber = 0;
		
		for (String string : poem) {
			rowNumber++;
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (Arrays.asList(parts).contains(specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println(Arrays.toString(parts));
				NumberOfRows.add(rowNumber);
			}
		}
		if(NumberOfRows.isEmpty()){
			NumberOfRows.add(-1);
		}
		return NumberOfRows;
	}
	
	public List<String> appearedRowsWords(String[] poem, String specificWord) {
		String specificWordCapitalized = capitalize(specificWord);
		String specificWordDeCapitalized = specificWord.substring(0, 1).toLowerCase() + specificWord.substring(1);
		List<String> RowWords = new ArrayList<String>();
		
		
		for (String string : poem) {
			String[] parts = string.replaceAll("[,:!?.]","").split(" ");
			if (Arrays.asList(parts).contains(specificWordDeCapitalized) || Arrays.asList(parts).contains(specificWordCapitalized)) {
//				System.out.println();
				RowWords.add(string);
			}
		}
		return RowWords;
	}
	
	public String capitalize(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
	public String deCapitalize(String word) {
		return word.substring(0, 1).toLowerCase() + word.substring(1);
	}
	

}
