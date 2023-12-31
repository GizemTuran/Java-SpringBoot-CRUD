## Java Spring Boot CRUD Çalışması
#### Bu proje, Java Spring Boot kullanarak birbirine bağlı iki tablo olan "Company" ve "Employee" üzerinde CRUD operasyonlarını gerçekleştiren bir uygulama için temel bir taslağı içerir.
## Proje Yapısı
#### Company ve Employee adında iki adet modelimiz var. Bunlar veritabanı tablolarının model sınıflarını içerir. Bir şirketin birden fazla çalışanı olabileceği için 'ManyToOne' ilişkisi kullandım.
#### CompanyRepository ve EmployeeRepository adında iki tane repository var. Burada ekleme,silme,güncelleme ve belirli kriterlere göre sıralama gibi işlemleri gerçekleştirir.
#### İki tane de servisimiz bulunuyor, CompanyService ve EmployeeService. Burada sadece imzalarımızı atarız ,yani interface tanımlamalarımız bulunur.
#### ServiceImpl kısmında implementasyonları tamamlandı. Dependency injection design patterni ile repositorye ve modelmapper classına erişim sağlanır. Burada dönüştürme ve veritabanına kayıt işlemleri yapılır.
#### Controller katmanında ise belirli bir url dizinine gelen HTTP requestleri(@GetMapping, @PostMapping, @PutMapping @DeleteMapping) yönlendirir.

### Employee HTTP methodları ve Endpoinleri
![employeehttpmethodları](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/03177348-3a4e-4957-9f8d-61fb2dc449a2)

### Company HTTP methodları ve Endpoinleri
![companyhttpmethodlar](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/c411b24c-9eb4-4b13-a308-429388bb935e)
