import java.util.List;

public class Maths {

    int add(List<Integer> numbers) {

        if (numbers.size() == 2) {
            return numbers.get(0) + numbers.get(1);
        } else if (numbers.size() == 3) {
            return numbers.get(0) + numbers.get(1) + numbers.get(2);
        }
        return 0;
    }
}
