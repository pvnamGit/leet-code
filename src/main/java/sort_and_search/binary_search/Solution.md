Tại sao dùng left + (right - left) / 2?
Khi bạn tính mid bằng (left + right) / 2, có khả năng xảy ra lỗi tràn số nếu left và right là các giá trị lớn.

Giả sử:
left = 2,000,000,000
right = 2,000,000,000
Nếu bạn sử dụng (left + right) / 2, kết quả là:

>(2,000,000,000 + 2,000,000,000) / 2 = 4,000,000,000 / 2 = 2,000,000,000

Với các giá trị lớn hơn, tổng left + right có thể vượt quá giới hạn của kiểu int trong Java (khoảng ±2,147,483,647), gây ra lỗi tràn số.

Với cách tính left + (right - left) / 2:
Khi sử dụng left + (right - left) / 2, chúng ta tránh được lỗi tràn số vì phép trừ right - left không làm tăng giá trị và không vượt quá giới hạn của int.

Ví dụ:

left = 2,000,000,000
right = 2,000,000,000
Với cách tính này, kết quả là:
```json
left + (right - left) / 2 = 2,000,000,000 + (2,000,000,000 - 2,000,000,000) / 2 = 2,000,000,000 + 0 = 2,000,000,000
```