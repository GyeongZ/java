package day16.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Board {
	@NonNull
	private int grade, classNum, num;
	@NonNull
	private String name;
}
