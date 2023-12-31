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
2.
برنامه موردنظر برای profiling:
در این قسمت ما برنامه ای را نوشته ایم که یک کاراکتر و دو عدد n و m را در  ورودی میگیرد و سپس یک شکل مثلث به اندازه n از ان کاراکتر ساخته و  ان را به تعداد
m  بار کپی میکند.


مثال:
![p](https://github.com/Abz81/SE_Lab5/assets/101315890/4c164751-9284-488d-9def-11c05833dc7a)

        ابتدا برای این کار از قطعه کد زیر استفاده کردیم که داده ها را به صورت ارایه دوبعدی ذخیره و سپس چاپ به صورت ارایه ای چاپ کردیم.
        
![sc7](https://github.com/Abz81/SE_Lab5/assets/101315890/cdf0130b-10a1-42f9-aa9b-df5ec44da423)

عملیات profiling را با استفاده از نرم افزار Yourkit بر روی ان انجام میدهیم:
![Screenshot (15)](https://github.com/Abz81/SE_Lab5/assets/101315890/442d5d84-a60d-4ebd-8bd3-7ed006929e13)
همان طور که در شکل زیر مشاهد میشود بیشترین منابع را   char_triangle_Builder به دلیل و جود print های پی در پی دارد مصرف میکنند بنابراین نتیجه میگیریم که امکان دارد از لحاظ پیاده سازی بهینه نباشد.


![Screenshot (16)](https://github.com/Abz81/SE_Lab5/assets/101315890/8f1663b9-7064-45de-ae25-8eb56979b4fa)

![Screenshot (17)](https://github.com/Abz81/SE_Lab5/assets/101315890/3045c2df-628a-4693-9b3d-ba8585df27d7)

قطعه کد اصلاح شده که به صورت string کاراکتر های مورد نظر را چاپ میکند به عبارتی در حالت قبل تداد پرینت ها به ازای m<<n  منتاسب با مجذور تعداد پرینت ها در این قسمت است.

قطعه کد جدید:

![sc8](https://github.com/Abz81/SE_Lab5/assets/101315890/adb57efe-c239-4e48-ac7a-806af7867b7d)


در حالت دوم مشاهده کردیم که مصرف منابع در حد خوبی کاهش یافته همچنین درصد منابعی که صرف    printمیشد از 98 درصد به 90 درصد کاهش پیدا کرده است.همچنین میزان استفاده از  cpuهم با مقدار قابل توجهی کاهش یافته .
![Screenshot (18)](https://github.com/Abz81/SE_Lab5/assets/101315890/54888d2e-8eeb-4001-92a7-524439e38da2)
![Screenshot (19)](https://github.com/Abz81/SE_Lab5/assets/101315890/ee639a55-9dc8-4493-b3a5-3ec8b0e97ec1)
