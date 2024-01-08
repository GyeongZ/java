package word;

import java.util.ArrayList;
import java.util.List;

//단어장
public class Vocabulary {
		
	private List<Word> list; //단어 리스트

	public Vocabulary(List<Word> list) {
		if(list == null) {
			list = new ArrayList<Word>();
		}
		this.list = list;
	}
	
	//단어 추가 기능
	public boolean addWord(String word, String partOfSpeech, String mean) {
		if(list == null) {
			return false;
		}
		
		//이미 등록된 단어이고, 뜻도 등록되었으면
		int index = list.indexOf(new Word(word));
		if(index >= 0 && list.get(index).getMeanList().contains(new Mean(mean))){
			return false;
		}
		//이미 등록된 단어라면
		if(index>= 0) {
			list.get(index).addMean(partOfSpeech, mean);
			return true;
		}
		return true;
	}
	

}
