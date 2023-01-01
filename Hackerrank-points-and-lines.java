class LineList implements ListOfLines {
    
    // attribute
    Vector<Line>list_of_lines = new Vector<>();
    
    // constructor?
    LineList(Vector<Line> lines){
        // System.out.println("Constructor?!");
        list_of_lines = lines;
        // System.out.println("Initlize list of lines attribute...");
    }
    
    // method 1
    public Line getLineWithMaxLength(){
        
        Line maxLine = null;
        
        for (Line line : list_of_lines){
            if (maxLine == null || line.getLineLength() > maxLine.getLineLength()) {
                maxLine = line;
            }
        }
        return maxLine;
    }
    
    // method 2
    public Vector<Line> getLinesFromStartingPoint(Point p){
        Vector<Line> starting_lines = new Vector<>();
        
        for (Line line : list_of_lines) {
            if (line.getStart().equals(p)) {
                starting_lines.add(line);
            }
        }
        
        // something something
        return starting_lines;
    }
    
}
