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

با بررسی کد تابع `temp` می‌بینیم با حذف شدن این تابع تغییری در منطق برنامه ایجاد نمی‌شود زیرا این تابع side effecty نداشته و فقط `Arraylist a‍` را با حجم زیادی داده پر می‌کند.

با حدف این تابع از برنامه، برنامه به‌طور کامل اجرا شده و خطایی دریافت نمی‌کنیم. نمودارهای مربوط به اجرای برنامه بعد از برطرف کردن مشکل را در زیر مشاهده می‌کنیم.

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/820dd54b-6bb9-4d42-9086-03e103bbbddb)
![image](https://github.com/Abz81/SE_Lab5/assets/45371919/1ecc2226-0a49-4047-8f9b-39d47797d5d9)
![image](https://github.com/Abz81/SE_Lab5/assets/45371919/edecaaf4-4686-4c76-9923-da245197176b)

