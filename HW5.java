public class HW5 {
    public static void main(String[] args) {
        task0();
    }
        static void task0(){
        phoneBook phoneBook = new phoneBook();
        phoneBook.add("123456789", "Андрей");
        phoneBook.add("987654321", "Григорий");
        phoneBook.add("456789123", "Эржан");
        phoneBook.add("321654987", "Степан");
        phoneBook.add("789123456", "Алексадр");
        phoneBook.add("654987321", "Александра");
        phoneBook.add("234567891", "Иван");
        phoneBook.add("876543219", "Пётр");
        phoneBook.add("345678912", "Влада");
        phoneBook.add("432165498", "Андрей");
        phoneBook.add("876543219", "Степан");
        phoneBook.add("234567891", "Сергей");
        phoneBook.add("654987321", "Владимир");
        phoneBook.add("435455423", "Владимир");
        phoneBook.add("789123446", "Виктория");
        phoneBook.add("321654987", "Дэвид");
        phoneBook.add("321654987", "Виталий");
        phoneBook.add("321654987", "Василий");
        System.out.println(phoneBook.getPhoneNum("876543219"));
        System.out.println(phoneBook.getByName("Пётр"));
        System.out.println(phoneBook.getAll());
    }
}