## Java Spring Boot CRUD Çalışması
### Bu proje, Java Spring Boot kullanarak birbirine bağlı iki tablo olan "Company" ve "Employee" üzerinde CRUD operasyonlarını gerçekleştiren bir uygulama için temel bir taslağı içerir.
## Proje Yapısı
### Company ve Employee adında iki adet modelimiz var. Bunlar veritabanı tablolarının model sınıflarını içerir. Bir şirketin birden fazla çalışanı olabileceği için 'ManyToOne' ilişkisi kullandım.
### CompanyRepository ve EmployeeRepository adında iki tane repository var. Burada ekleme,silme,güncelleme ve belirli kriterlere göre sıralama gibi işlemleri gerçekleştirir.
### Ve tabii ki iki tane de servisimiz bulunuyor. Burada sadece imzalarımızı atarız ,yani interface tanımlamalarımız bulunur.
### ServiceImpl kısmında implementasyonları tamamlandı. Dependency injection design patterni ile repositorye ve modelmapper classına erişim sağlanır. Burada dönüştürme ve veritabanına kayıt işlemleri yapılır.
### Controller katmanında ise belirli bir url dizinine gelen HTTP requestleri(@GetMapping, @PostMapping, @PutMapping @DeleteMapping) yönlendirir.
