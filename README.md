# SE_Lab5

## Team members
* Alireza Ziaee
* Abdollah Zohrabi

<div dir='rtl'>

## تمرین
1.ابتدا profilling را بر روی کلاس javaCup اجرا میکنیم:


![Screenshot (9)](https://github.com/Abz81/SE_Lab5/assets/101315890/9413d913-f96e-46fc-83a5-8f6f6d67c87e)
بعد از دادن ورودی‌ها به برنامه، برنامه با خطای `OutOfMemoryError` متوقف می‌شود.
![image](https://github.com/Abz81/SE_Lab5/assets/45371919/5517a8c3-4c0a-46f9-b946-f5ed8b826e20)

سپس مشاهده میکنیم که باتوجه به اطلاعات   CPU  از نرم افزارYourkit بیش‌ترین مصرف منابع را javaCup.main() و  javaCup.temp() دارد:

![Screenshot (12)](https://github.com/Abz81/SE_Lab5/assets/101315890/8d31cc59-3b4c-4b33-90d7-d49b60251232)

![Screenshot (13)](https://github.com/Abz81/SE_Lab5/assets/101315890/a5f79da8-5879-47bd-949a-c97beaf77e54)

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/6f75288b-da4f-4167-9201-32e2570e4d0a)

با بررسی کد تابع `temp` می‌بینیم که این تابع از `ArrayList` برای ذخیره‌کردن داده استفاده می‌کند و چون `object` است در `heap` نگه‌داری می‌شود و خطایی که با آن برخورد کردیم به دلیل بزرگ‌شدن `heap` بود. با توجه به اینکه تعداد آیتم‌هایی که می‌خواهیم ذخیره کنیم تعداد ثابتی دارند می‌توانیم از آرایه استفاده کنیم تا داده در stack ذخیره شود. پس تابع `temp` را به صورت زیر تغییر می‌دهیم.

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/0028d200-0572-48fe-91fd-0251e92b0917)


با اعمال تغییر گفته‌شده مشاهده می‌کنیم برنامه بدون خطا اجرا می‌شود. نمودارهای مربوط به برنامه‌ی اصلاح شده را در زیر مشاهده می‌کنیم.

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/cd15aa54-f54e-4ef8-8aa4-e02c335f932b)

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/b532be9c-9b6c-43e3-83f4-8063bfea708e)

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/33504a4e-c402-4d5f-879f-60cf02171607)



