package FileWithDocuments;

public class MainFolderWithDocuments {


//    Программа на вход получает путь к папке (задается через консоль).
//    В заданной папке находятся текстовые файлы (формат тхт).
//    Каждый файл содержит произвольный текст. В этом тексте может быть
//    номер документа(один или несколько), емейл и номер телефона.
//    номер документа в формате: xxxx-yyy-xxxx-yyy-xyxy, где x - это
//    любая цифра, а y - это любая буква русского или латинского алфавита
//    номер телефона в формате: +(ХХ)ХХХХХХХ

//    Документ может содержать не всю информацию, т.е. например, может не
//    содержать номер телефона, или другое поле.
//    Необходимо извлечь информацию из N текстовых документов. Число
//    документов для обработки N задается с консоли.
//    Если в папке содержится меньше документов, чем заданное число -
//    следует обрабатывать все документы.

//    Извлеченную информацию необходимо сохранить в следующую
//    структуру данных:
//    Map<String, Document>, где
//    ключ типа String - это имя документа без расширения,
//    значение типа Document - объект кастомного класса, поля которого
//    содержат извлеченную из текстового документа информацию
//    Учесть вывод сообщений на случаи если,
//- на вход передан путь к папке, в которой нет файлов
//- все файлы имеют неподходящий формат (следует обрабатывать
//только тхт файлы)
//- так же сообщения на случай других исключительных ситуаций
//    TeachMeSkills.by
//    В конце работы программы следует вывести сообщение о том, сколько
//    документов обработано и сколько было документов невалидного
//            формата


    public static void main(String[] args) {

        //Create object of class Reader
        Readable reader = new Reader();

        //Create object of class FileCreate
        FileCreate fileCreate1 = new FileCreate();

        //If you want to create a new file in Secret folder
        fileCreate1.createFileTxt();


        //path variable for tests
//        String path = "src/FileWithDocuments/SecretFolder";         //Path for tests

        System.out.print("\n\nEnter path to the Secret folder: ");
        String path = reader.getStringScanner();

        //Variable of quantity of files for reading
        System.out.print("\nEnter quantity of checking files: ");
        int fileQuantity = reader.getIntScanner();
        reader.getStringScanner();

//        Create object of class FileCreate
        FileCreate fileCreate = new FileCreate(path, fileQuantity);


        //Create object of class MapCollection
        MapCollection mapCollection = new MapCollection(fileCreate);

        System.out.println("\n\n***************************************\n In main:");
        fileCreate.createFileTxtList();


        System.out.println("\nMap collection is:\n" + mapCollection.fillDocMap());
    }
}
