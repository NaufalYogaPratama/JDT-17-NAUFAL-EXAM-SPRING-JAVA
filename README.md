# JDT-17 Spring

---
## Jawaban Penjelasan Singkat
### 1. Apa fungsi `@ConfigurationProperties`?
`@ConfigurationProperties` digunakan untuk melakukan binding data (pemetaan properti) secara aman dan terstruktur (*type-safe binding*) dari file konfigurasi eksternal seperti `application.yml` atau `application.properties` ke dalam class objek Java (POJO).
* **Manfaat**:
  * Mengelompokkan konfigurasi yang memiliki prefix yang sama (contoh: `store.*`).
  * Memungkinkan validasi field konfigurasi menggunakan Bean Validation (seperti `@NotBlank`, `@Min`, dll.).
  * Lebih rapi, modular, dan type-safe dibandingkan menggunakan banyak anotasi `@Value`.
### 2. Apa fungsi `ResourceLoader`?
`ResourceLoader` adalah interface di dalam Spring Framework yang digunakan untuk memuat, mencari, dan membaca file eksternal (resource) seperti file `.txt`, `.json`, `.xml`, atau gambar dari berbagai lokasi.
* **Manfaat**:
  * Menyediakan abstraksi penanganan file secara seragam menggunakan prefix lokasi, contohnya `classpath:` (dari folder resources), `file:` (dari local disk), atau `http:` (dari internet).
  * Menyederhanakan pembacaan file di dalam container Spring.
### 3. Apa fungsi `MessageSource`?
`MessageSource` adalah interface di Spring yang digunakan untuk mendukung internasionalisasi (*Internationalization* / i18n) dan lokalisasi (*Localization* / L10n). 
* **Manfaat**:
  * Mengambil teks/pesan dari berkas bundle (seperti `messages.properties` atau `messages_id.properties`) berdasarkan parameter `Locale` tertentu secara dinamis.
  * Mendukung parameterisasi dinamis (menggunakan placeholder seperti `{0}`, `{1}`) untuk menyisipkan argumen di runtime.
---
