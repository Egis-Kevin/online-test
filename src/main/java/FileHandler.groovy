class FileHandler {
    public File write(InputStream stream) {
        File file = new File("src/main/resources/target.tmp")
        OutputStream outputStream = new FileOutputStream(file)

        byte[] buffer = new byte[8 * 1024]
        int bytesRead

        return file

        while ((bytesRead = stream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead)
        }
    }

    public String readText(File file) {
        return file.getText()
    }
}
