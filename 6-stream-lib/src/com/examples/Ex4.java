package com.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Todo implements Comparable<Todo>{
	
	private int id;
	private String title;
	private boolean completed;

	public Todo(int id, String title, boolean completed) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isCompleted() {
		return completed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (completed ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (completed != other.completed)
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(Todo o) {
		return Integer.compare(this.id, o.id);
	}
	

}

public class Ex4 {

	public static void main(String[] args) {
		
		//-------------------------------------------------
		List<Todo> todos=Arrays.asList(
				new Todo(23234, "item-1", true),
				new Todo(23423, "item-2", true),
				new Todo(45545, "item-3", false),
				new Todo(34555, "item-4", true),
				new Todo(56566, "item-5", false),
				new Todo(56566, "item-5", false)
				);
		//-------------------------------------------------
		
		Comparator<Todo> byTitle=(o1,o2)->o2.getTitle().compareTo(o1.getTitle());
		Comparator<Todo> byComplete=(o1,o2)-> o1.isCompleted() ? 1 : -1;
		
		Comparator<Todo> byTileAndComplete=byTitle.thenComparing(byComplete);
		
		
		System.out.println(
				
			todos
			.stream()
			.filter(todo->true)
			//.limit(2)
			//.distinct()
			//.map(todo->todo.getTitle().toUpperCase()) // n - n
			//.sorted(byTileAndComplete)
			//.forEach(System.out::println);
			//.allMatch(todo->todo.isCompleted())
			//.anyMatch(todo->todo.isCompleted())
			//.noneMatch(todo->todo.isCompleted())
			//.toArray(size->new Todo[size]);
			//.toArray(Todo[]::new);
			//.count()
			//.findFirst()
			//.findAny()
			//.mapToInt(todo->todo.getId())
			//.max()
			//.min()
			//.map(todo->todo.getTitle())
//			.reduce((acc,nextTititle)->{
//				System.out.println(acc);
//				System.out.println(nextTititle);
//				return acc+" "+nextTititle;
//			})
			//.collect(()->new StringBuilder(), (sb,nextTititle)->{sb.append(nextTititle);}, (sb1,sb2)->sb1.append(sb2))
			//.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
			//.collect(Collectors.joining(",", "[", "]"))
			//.collect(Collectors.toList())
			//.collect(Collectors.toSet())
			//.collect(Collectors.groupingBy(todo->todo.isCompleted()))
			
		);

		
		//--------------------------------------------------
		
//		String[] menu= {"veg1,veg2,nveg1","nveg1,nveg2"};
//		
//		Arrays
//		.stream(menu)
//		.flatMap(m->Stream.of(m.split(",")))
//		.distinct()
//		.forEach(System.out::println);
		
//		--------------------------------------------------
		
	}

}
