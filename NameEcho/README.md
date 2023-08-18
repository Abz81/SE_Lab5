<div dir='rtl'>
این برنامه نام کاربر را به عنوان ورودی دریافت کرده و در نهایت نام کاربر را به تعداد بالا چاپ می‌کند.
وضعیت مصرف منابع در حالتی که کد بهینه نباشد به‌صورت زیر می‌باشد.

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/a63cad3b-75da-4e68-9a2e-f426391f452e)
  
![image](https://github.com/Abz81/SE_Lab5/assets/45371919/d237e4ee-75cc-45d5-89e4-12ec82558e42)

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/e5497f14-7c5e-401e-a346-faed7907aff0)

![image](https://github.com/Abz81/SE_Lab5/assets/45371919/4c5473ce-9064-4ed3-9b96-4ef21c32246d)

مشاهده می‌کنیم تابع `echoNameJoyfully` منابع زیادی را مصرف می‌کند. با مشاهده‌ی کد این تابع متوجه می‌شویم مشکل به دلیل concatenation رشته‌ها در حلقه است.
از آنجا که `String` در جاوا immutable است، در هر بار که آن را concat می‌کنیم، باید `object` جدیدی از `String` ساخته شود.
سربار تولید تعداد زیاد `object` و همچنین سربار فعال‌شدن GC برای پاک کردن `object` ها باعث بالارفتن مصرف منابع این تابع می‌شود.
کد این تابع را به‌صورت زیر تغییر می‌دهیم تا مشکل برطرف شود.
![image](https://github.com/Abz81/SE_Lab5/assets/45371919/b16e01b1-7f29-412d-a22a-2ad2cfea88a7)


</div>
