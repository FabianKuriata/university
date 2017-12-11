
 let divideList (list, number) =
	if number > List.length list then raise(Failure "Za duza do podzialu")
	else if number < 0 then raise(Failure "Ujemna licza")
	else
		let rec divide (list, number, listAcc, listOfListAcc, counter) =
			
			if list <> [] then
					if counter < number then divide(List.tl list, number, List.hd list::listAcc, listOfListAcc, counter+1)
					else divide(list, number, [], listOfListAcc @ [listAcc], 0)
			else
				listOfListAcc @ [listAcc]
		in divide (list, number, [], [], 0)
				
	divideList([2;3;4;5;6;7;8],2)
							
