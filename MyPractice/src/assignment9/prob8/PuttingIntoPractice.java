package assignment9.prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Milan");
        Trader briyn = new Trader("Briyn","Cambridge");
		
		List <Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(briyn, 2012, 1000),
            new Transaction(raoul, 2010, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2009, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println("All transaction from 2011 and sort by value");
		List<String> traders=
		transactions.stream()
		.filter( x->x.getYear()>=2011)
		.sorted(Comparator.comparing(Transaction::getValue).reversed())
		.map(t->t.getTrader().getName())
		.collect(Collectors.toList());
		
		System.out.println(traders);

        
        // Query 2: What are all the unique cities where the traders work?
		System.out.println("\nAll distinct cities are\n");
		transactions.stream()
		.map(t->t.getTrader())
		.map(Trader::getCity)
		.distinct()
		.forEach(System.out::println);
		
        
		

        // Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println("\nAll traders from cambridge and sort by name");
		
		transactions.stream()
		.filter(t->t.getTrader().getCity().equalsIgnoreCase("cambridge"))
		.map(Transaction::getTrader)
		.map(Trader::getName)
		.sorted(Comparator.comparing(String::length))
		.forEach(System.out::println);
		
		
		
        // Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println("All traders name sorted by string");
		transactions.stream()
		.map(t->t.getTrader().getName())
		.sorted(Comparator.comparing(String::length))
		.distinct()
		.forEach(System.out::println);
        

        // Query 5: Are there any trader based in Milan?
		System.out.println("Is there trader based in milan");
		Optional<Trader> aOptional=
		transactions.stream()
		.map(t->t.getTrader())
		.filter(x->x.getCity().equalsIgnoreCase("milan"))
		.findAny();
		
		System.out.println(aOptional.isPresent());
		
		
		
        
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		System.out.println("Updating to cambridge");
		transactions.stream()
		.filter(x->x.getTrader().getCity().equalsIgnoreCase("milan"))
		.map(Transaction::getTrader)
		.forEach(x->x.setCity("cambridge"));
		
		System.out.println(transactions);
		
		
        
        // Query 7: What's the highest value in all the transactions?
		
		Optional<Integer> opt=
		transactions.stream()
		.map(Transaction::getValue)
		.max(Comparator.comparingInt(Integer::valueOf));
		
		System.out.println(opt.get());
		
		List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
		List<Integer> intList=
		listOfLists.stream()
		.flatMap(l->l.stream())
		.collect(Collectors.toList());
		
		System.out.println(intList);
		
		//creating stream from arrays
		Integer[] arrOfInt = {1, 3, 5, 7};
		Stream<Integer> strOfInt = Stream.of(arrOfInt);
		Optional<Integer> optional=
		strOfInt.max(Comparator.comparing(Integer::valueOf));
		System.out.println(optional.get());
		
		//instream
		
		IntStream ins=IntStream.of(3,5,32,5);
		ins.sorted().forEach(System.out::println);
		
		//or creating array list then stream
		Integer[] x = {1, 3, 5, 7};
		List<Integer> lixt=Arrays.asList(x);
		lixt.stream()
		.forEach(System.out::println);
		
		//generating numbers
		List <Integer> list=Stream.iterate(1,z->z+1)
				.skip(2)
				.limit(6)
				.collect(Collectors.toList());
		System.out.println(list);
		
		//generating random numbers
		
		Stream<Double> randoms =
				Stream.generate(Math::random).limit(10);
		System.out.println("Randos"+randoms.collect(Collectors.toList()));
		
		//stream of strings
		Stream<Character> combined =
				Stream.concat(characterStream("Hello"),
				characterStream("World"));
		
		
		
		
		
		
		
		
    }
    public static Stream<Character> characterStream(String s) {
        return s.chars().mapToObj(c -> (char) c);
    }
    
}
