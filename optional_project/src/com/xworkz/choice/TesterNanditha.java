package com.xworkz.choice;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import static java.util.stream.Collectors.toList;

import com.xworkz.choice.dto.WonderDTO;
import com.xworkz.choice.dto.WonderDTO.WonderType;

public class TesterNanditha {

	public static void main(String[] args) {

		WonderDTO wonder1 = new WonderDTO("Taj-Mahal", "India", WonderType.AD);

		WonderDTO wonder2 = new WonderDTO("Great Wall", "China", WonderType.BC);

		WonderDTO wonder3 = new WonderDTO("Chichén Itza", "Mexico", WonderType.AD);

		WonderDTO wonder4 = new WonderDTO("Petra", "Jordan", WonderType.BC);

		WonderDTO wonder5 = new WonderDTO("Machu Picchu", "Machu Picchu", WonderType.BC);

		WonderDTO wonder6 = new WonderDTO("Christ the Redeemer", "Brazil", WonderType.BC);

		WonderDTO wonder7 = new WonderDTO("Colosseum", "Colosseum", WonderType.BC);

		List<WonderDTO> wonderList = new ArrayList<WonderDTO>();
		wonderList.add(wonder1);
		wonderList.add(wonder2);
		wonderList.add(wonder3);
		wonderList.add(wonder4);
		wonderList.add(wonder5);
		wonderList.add(wonder6);
		wonderList.add(wonder7);

		List<WonderDTO> bcWonderList = new ArrayList<WonderDTO>();
		// sub-group
		wonderList.forEach(w -> {
			if (w.getPeriod().equals(WonderType.BC)) {
				bcWonderList.add(w);
			}
		});

		// here we do sorting the wonders based on place
		Collections.sort(bcWonderList, (a1, a2) -> a2.getPlace().compareTo(a1.getPlace()));

		// here we do sorting the wonders based on name
		Collections.sort(bcWonderList, (a1, a2) -> a2.getName().compareTo(a1.getPlace()));

		List<String> bcWonderNameList = new ArrayList<String>();

		// here extracted or transformed
		bcWonderList.forEach(w -> {
			bcWonderNameList.add(w.getPlace());
		});

		System.out.println(bcWonderNameList);

		System.out.println("STREAMSTREAMSTREAM");

		// wonderList.stream().sorted((a1, a2) -> a2.getPlace().compareTo(a1.getPlace()));

		List<String> list = wonderList
				.stream()
				.filter(e -> e.getPeriod().equals(WonderType.BC))
				.sorted((a1, a2) -> a2.getPlace().compareTo(a1.getPlace()))
				.map(e -> e.getName())
//				.collect(Collectors.toList());//or 
				.collect(toList());

		System.out.println(list);
	}

}
