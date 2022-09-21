package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String nameDP = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payday = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String emailDP = sc.nextLine();
		System.out.print("Telefone: ");
		String phoneDP = sc.nextLine();
		System.out.println();

		Department dept = new Department(nameDP, payday, new Address(emailDP, phoneDP));

		System.out.print("Quantos funcionários tem o departamento? ");
		int N = sc.nextInt();
		System.out.println();

		for (int i = 0; i < N; i++) {
			System.out.println("Dados do funcionário " + (i + 1) + ": ");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();

			dept.addEmployee(new Employee(name, salary));

			System.out.println();
		}
		
		showReport(dept);

		sc.close();
	}

	private static void showReport(Department dept) {
		System.out.println("FOLHA DE PAGAMENTO:");
		System.out.println("Departamento " + dept.getName() + " = R$ " + String.format("%.2f", dept.payroll()));
		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
		System.out.println("Funcionários: ");
		for (Employee dp : dept.getEmployees()) {
			System.out.println(dp.getName());
		}
		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());	
	}

}
