/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author P51
 */
/*
Ở các trường đại học, tiền lương của giảng viên được tính toán dựa trên số giờ chuẩn giảng dạy trực tiếp. 

Môn học có mã môn và tên môn

Thông tin của mỗi giảng viên gồm mã giảng viên, tên giảng viên.

Khi tham gia giảng dạy, giảng viên sẽ được ghi nhận số giờ chuẩn cho từng môn.

Giả sử với mỗi môn học thì một giảng viên chỉ giảng dạy nhiều nhất 1 lớp học phần nhưng vẫn có thể dạy nhiều môn học khác nhau.

Viết chương trình lập bảng tính toán giờ chuẩn cho từng giảng viên.

Input – 3 file văn bản

File MONHOC.in

Dòng đầu ghi số môn học. Mỗi môn học viết trên một dòng gồm mã môn, sau đó đến khoảng trống rồi đến tên môn.

File GIANGVIEN.in

Dòng đầu ghi số giảng viên. Mỗi giảng viên viết trên một dòng gồm mã giảng viên và tên giảng viên.

File GIOCHUAN.in

Dòng đầu ghi số lớp học phần. Mỗi lớp học phần sẽ ghi trên một dòng gồm mã giảng viên, mã môn sau đó đến giờ chuẩn (dạng số thực).



Ghi ra danh sách giảng viên theo thứ tự nhập và tổng giờ chuẩn tính được. Thông tin cần liệt kê chỉ bao gồm tên giảng viên và tổng số giờ chuẩn (viết chính xác đến 2 số phần thập phân).

Ví dụ

Input – 3 file văn bản

Output

MONHOC.in

2

INT1155 Tin hoc co so 2

INT1306 Cau truc du lieu va giai thuat

 

GIANGVIEN.in

2

GV01 Nguyen Van An

GV02 Hoang Binh Minh

 

GIOCHUAN.in

2

GV01 INT1155 113.2

GV02 INT1306 126.72
Output
Nguyen Van An 113.20

Hoang Binh Minh 126.72


*/
import java.util.*;
import java.io.*;
public class Bai5 {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_storing/bai5/MONHOC.in"));
//        Scanner input2 = new Scanner(new File("src/file_storing/bai5/GIANGVIEN.in"));
//        Scanner input3 = new Scanner(new File("src/file_storing/bai5/GIOCHUAN.in"));
        Scanner input1 = new Scanner(new File("MONHOC.in"));
        Scanner input2 = new Scanner(new File("GIANGVIEN.in"));
        Scanner input3 = new Scanner(new File("GIOCHUAN.in"));
        
        int n = Integer.parseInt(input1.nextLine());
//        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            
            String s = input1.nextLine();
        }
        int m = Integer.parseInt(input2.nextLine());
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            lecturers.add(new Lecturer(input2.nextLine()));
        }
        int p = Integer.parseInt(input3.nextLine());
        for (int i = 0; i < p; i++) {
            String s = input3.nextLine().trim();
            String a[] = s.split("\\s+");
            String lecturerId = a[0];
            Double standardTime = Double.parseDouble(a[2]);
            for (Lecturer x : lecturers) {
                if (x.getLecturerId().equals(lecturerId)) {
                    x.setStandardTime(standardTime);
                }
            }
            
            
        }
        for (Lecturer x : lecturers) {
            System.out.println(x);
        }
               
    }
}
