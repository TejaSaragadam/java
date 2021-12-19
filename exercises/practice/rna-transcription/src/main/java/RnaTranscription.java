class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<String, String> transcriptor = new HashMap<>();
        transciptor.put('G', 'C');
        transciptor.put('C', 'G');
        transciptor.put('T', 'A');
        transciptor.put('A', 'U');
        
        dnaStrand.split('').forEach(str-> System.out.print(transcriptor.get(str)));
    }

}
