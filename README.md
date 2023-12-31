## Java Spring Boot CRUD Çalışması
#### Bu proje, Java Spring Boot kullanarak birbirine bağlı iki tablo olan "Company" ve "Employee" üzerinde CRUD operasyonlarını gerçekleştiren bir uygulama için temel bir taslağı içerir.
## Proje Yapısı
#### Company ve Employee adında iki adet modelimiz var. Bunlar veritabanı tablolarının model sınıflarını içerir. Bir şirketin birden fazla çalışanı olabileceği için 'ManyToOne' ilişkisi kullandım.
#### CompanyRepository ve EmployeeRepository adında iki tane repository var. Burada ekleme,silme,güncelleme ve belirli kriterlere göre sıralama gibi işlemleri gerçekleştirir.
#### İki tane de servisimiz bulunuyor, CompanyService ve EmployeeService. Burada sadece imzalarımızı atarız ,yani interface tanımlamalarımız bulunur.
#### ServiceImpl kısmında implementasyonları tamamlandı. Dependency injection design patterni ile repositorye ve modelmapper classına erişim sağlanır. Burada dönüştürme ve veritabanına kayıt işlemleri yapılır.
#### Controller katmanında ise belirli bir url dizinine gelen HTTP requestleri(@GetMapping, @PostMapping, @PutMapping @DeleteMapping) yönlendirir.
#### Uygulama 8080 portu üzerinden kalkar.

### Employee HTTP methodları ve Endpoinleri
![employeehttpmethodları](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/03177348-3a4e-4957-9f8d-61fb2dc449a2)

### Company HTTP methodları ve Endpoinleri
![companyhttpmethodlar](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/c411b24c-9eb4-4b13-a308-429388bb935e)

### Proje Testi

#### Employee Entity Tablosu
![employeetable](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/730bca9f-7e06-401c-bb66-a29c73cf746a)

#### Company Entity Tablosu
![companytable](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/2d0c855b-1392-4cc4-804b-4c4fef9490a4)

### API Testi
#### Postman kullanarak farklı API'leri test ettiğim bazı ekran görüntüleri

#### Company ekleme
![post](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/f1704362-fa1e-4a5f-bc27-e3910ba68a06)

#### Company'leri listeleme
![getfindall](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/4ed520a8-8894-47f9-a798-14f7aef1caa5)

#### Id'sine göre belirli bir Company bulma
![getfindbyid](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/06af6095-90f6-41ab-8c8f-d76e6577c04d)

#### Company güncelleme
![put](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/8c6d85f8-2c94-4fcf-8b4d-62bdd18b3828)

#### Employee Silme
![deleteemployee](https://github.com/GizemTuran/Java-SpringBoot-CRUD/assets/78648500/fc46ff42-116d-4865-a838-7e53e222aed0)




