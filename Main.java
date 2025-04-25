
    static void viewStudents() {
        if (students.isEmpty()) {
        System.out.println("No students found.");
        return;
        }
        System.out.println("\n--- List of Students ---");
        for (Student s : students) {
        System.out.println(s);
        }
        }
        static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        for (Student s : students) {
        if (s.getId() == id) {
        System.out.println("Student Found: " + s);
        return;
        }
        }
        System.out.println("Student with ID " + id + " not found.");
    }        
