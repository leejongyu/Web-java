package edu.java.lambda04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaMain04 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(

                new Employee(101, "이존규", "개발자", "개발 1팀", 300), new Employee(874, "김가영", "디자이너", "개발 1팀", 303),
                new Employee(302, "김지훈", "개발자", "개발 2팀", 301), new Employee(485, "최은정", "디자이너", "개발 2팀", 400),
                new Employee(133, "김용훈", "개발자", "개발 2팀", 302), new Employee(505, "추지훈", "부사장", "인사팀", 1000)

        );

        // 1. 모든 직원들의 정보를 출력. 한 줄에 1명씩 출력

        Iterator<Employee> itr = employees.iterator();
        System.out.println("\nEx. 1 ===========================");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();

        employees.stream().forEach(System.out::println);

        // 2. job이 "개발자"인 직원들의 급여 합계를 출력
        List<Employee> second = employees.stream().filter(s -> s.getJob().equals("개발자")).collect(Collectors.toList());
        int salary1 = 0;
        for (int i = 0; i < second.size(); i++) {
            salary1 += second.get(i).getSalary();

        }

        int sum = employees.stream().filter(s -> s.getJob().equals("개발자")).mapToInt(s -> s.getSalary()).sum();

        System.out.println(sum);

        System.out.println("\nEx. 2 ===========================");
        System.out.println(" 개발자 급여 합계 : " + salary1);

        // 3. dept가 "개발2팀"인 직원들의 급여 평균을 출력
        List<Integer> third = employees.stream().filter(s -> s.getDept().equals("개발 2팀")).map(Employee::getSalary)
                .collect(Collectors.toList());
        double salary2 = 0;
        for (Integer i : third) {
            salary2 += i;
        }
        System.out.println("------ 개발 2팀 급여 평균 ------");
        System.out.println(" 개발 2팀 급여 평균 : " + salary2 / third.size());

        int salary = 0; // 개발 2팀 직원들의 월급의 합계를 저장할 변수.
        int count = 0; // 개발 2팀 직원들의 수.

        for (Employee e : employees) {
            if (e.getDept().equals("개발 2팀")) {
                salary += e.getSalary();
                count++;
            }
        }
        double mean = (double) salary / count;
        System.out.println(mean);

        double avg = employees.stream().filter(s -> s.getDept().equals("개발 2팀")).mapToInt(s -> s.getSalary()).average()
                .getAsDouble(); // optional type을 double로 변경하여 리턴.
//              .orElse(x);     // 정상적인 경우에는 원하는 값, 그렇지 않은 경우에는 argument x를 리턴. \
//              .orElseThrow(); // Optional type을 정상적인 값 혹은 exeption으로 리턴.
        System.out.println(avg);

        // 4. 급여가 400 이상인 직원들의 정보를 한 줄씩 출력.
        List<Employee> last = employees.stream().filter(s -> s.getSalary() >= 400).collect(Collectors.toList());
        Iterator<Employee> itr2 = last.iterator();
        System.out.println("------ 급여가 400 이상인 사람들 리스트 ------");
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }

}
