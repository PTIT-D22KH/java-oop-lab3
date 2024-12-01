/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author P51
 */
/*
Công ty ABC chấm công các công nhân để tính thời gian làm việc, từ đó tính xem công nhân có làm việc đủ thời gian không. Thời gian làm việc chuẩn là 8 giờ. Thời gian làm việc của công nhân tính bằng thời gian ra về trừ thời gian đến và trừ một giờ (60 phút) nghỉ trưa. 

Input - nhập từ bàn phím

Dòng đầu của dữ liệu vào ghi số lượng công nhân chấm công (không quá 50).

Thông tin về một công nhân chấm công được ghi lại trên 4 dòng lần lượt là:

Mã công nhân (xâu ký tự độ dài không quá 10, không có khoảng trống)
Tên công nhân (xâu ký tự độ dài không quá 100, có thể có khoảng trống).
Giờ vào (định dạng hh:mm)
Giờ ra (định dạng hh:mm)
Ouput - In ra màn hình

Ghi ra danh sách công nhân đã được sắp xếp theo thời gian làm việc giảm dần cùng với thông tin thiếu (THIEU) hoặc đủ thời gian tiêu chuẩn (DU).

Trong trường hợp thời gian làm việc bằng nhau thì sẽ sắp xếp theo mã công nhân (thứ tự từ điển).

Ví dụ

Input



2
01T
Nguyen Van An
08:00
17:30
06T
Tran Hoa Binh
09:05
17:00
Output
01T Nguyen Van An 8 gio 30 phut DU
06T Tran Hoa Binh 6 gio 55 phut THIEU

*/
import java.text.ParseException;
import java.util.*;

public class Bai2 {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            workers.add(new Worker(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(workers);
        for (Worker x : workers) {
            System.out.println(x);
        }
        
    }
}
