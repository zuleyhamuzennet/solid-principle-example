# SOLID PRINCIPLES
- SOLID yazılım prensipleri diye adlandırılan ve dünya üzerinde, OOP nesne tabanlı yazılım geliştirirken kullanılan standartlaştırılmış 5 önemli tasarım ilkesi vardır.
- Bu ilkelerin amacı, yazılım tasarımlarını daha anlaşılır, bakımı daha kolay ve genişletilmesi daha kolay hale getirmektir.

## Açıklamalar 

# Single Responsibility Principle
- Single responsibility prensibi sınıflarımızın iyi tanımlanmış tek bir sorumluluğu olması gerektiğini anlatmaktadır. Bir sınıf (nesne) yalnızca bir amaç uğruna değiştirilebilir, o amaçta o sınıfa yüklenen sorumluluktur, yani bir sınıfın yapması gereken yalnızca bir işi olması gerekir.
- Eğer geliştirdiğiniz sınıf ya da fonksiyon birden fazla amaca hizmet ediyorsa, bu kurala aykırı bir geliştirme sürecinde olduğunuz anlamına geliyor. Bunu farkettiğinizde amaçlara uygun olarak parçalamanız gerekmektedir.
- SRP ile ilgili yapılan çalışmada bu prensibe uymayan SRP'ye uygun olmayan bir çalışmanın SRP'ye uygun şekilde tekrar kodlanması örneklenmiştir.


# Open/Closed Principle
- Adından da anlaşılacağı gibi, bu ilke, yazılım varlıklarının uzantıya açık, ancak değişiklik için kapalı olması gerektiğini belirtir. Sonuç olarak, iş gereksinimleri değiştiğinde işletme genişletilebilir, ancak değiştirilemez.
- OCP ile ilgili yapılan çalışmada bu prensibe uymayan OCP'ye uygun olmayan bir çalışmanın OCP'ye uygun şekilde tekrar kodlanması örneklenmiştir.

# Liskov Substitution Principle
- İlke, bir üst sınıfın nesnelerinin, uygulamayı bozmadan alt sınıflarının nesneleriyle değiştirilebileceğini tanımlar. Bu, alt sınıflarınızın nesnelerinin, üst sınıfınızın nesneleriyle aynı şekilde davranmasını gerektirir
- LSP ile ilgili yapılan çalışmada bu prensibe uymayan LSP'ye uygun olmayan bir çalışmanın LSP'ye uygun şekilde tekrar kodlanması örneklenmiştir.

# Interface Segregation Principle
- Interface Segregation Principle (ISP), hiçbir istemcinin kullanmadığı yöntemlere bağımlı olmaya zorlanmaması gerektiğini belirtir.
- Uygulama arayüzlerini daha küçük parçalara bölerek daha büyük arayüzler kullanmanın olumsuz etkilerinden bizi kurtarır . Her sınıfın veya arayüzün tek bir amaca hizmet ettiği Single Responsibility Principle'a benzer .
- ISP ile ilgili yapılan çalışmada bu prensibe uymayan ISP'ye uygun olmayan bir çalışmanın ISP'ye uygun şekilde tekrar kodlanması örneklenmiştir.

# Dependency Inversion Principle
- Bir sınıfın, metodun ya da özelliğin, onu kullanan diğer sınıflara karşı olan bağımlılığı en aza indirgenmelidir. Bir alt sınıfta yapılan değişiklikler üst sınıfları etkilememelidir.
- Yüksek seviye sınıflarda bir davranış değiştiğinde, alt seviye davranışların bu değişime uyum sağlaması gerekir. Ancak, düşük seviye sınıflarda bir davranış değiştiğinde, üst seviye sınıfların davranışında bir bozulma meydana gelmemelidir.
- Yüksek seviye ve düşük seviye sınıflar arasında bir soyutlama katmanı oluşturduğumuz taktirde her ikisi de soyut kavramlar üzerinden yönetilebilmektedir.

### Kaynaklar
- [Single Responsibility Principle](https://www.baeldung.com/java-single-responsibility-principle#:~:text=For%20example%2C%20if%20we%20have,the%20text%20in%20some%20way.)
- [Open/Closed Principle](https://stackify.com/solid-design-open-closed-principle/)
- [Liskov Substitution Principle](https://www.baeldung.com/java-liskov-substitution-principle)
- [Interface Segregation Principle](https://dzone.com/articles/solid-principles-interface-segregation-principle)
- [Dependency Inversion Principle](https://dzone.com/articles/solid-principles-dependency-inversion-principle)


