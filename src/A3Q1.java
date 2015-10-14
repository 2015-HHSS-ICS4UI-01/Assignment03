
        //sequential search
        
        //looking for 72
        is it 23? no 0
        is it 27? no 1 
        is it 30? no 2
        is it 34? no 3
        is it 41? no 4
        is it 51? no 5
        is it 55? no 6 
        is it 57? no 7
        is it 60? no 8
        is it 67? no 9
        is it 72? yes 10
        72 found at position 10 in the array
        return 10
        end
        
        //looking for 41
        is it 23? no 0
        is it 27? no 1
        is it 30? no 2
        is it 34? no 3
        is it 41? yes 4
        41 found at position 4 in the array
        return 4
        end
        
        //looking for 50
        is it 23? no 0
        is it 27? no 1
        is it 30? no 2
        is it 34? no 3
        is it 41? no 4
        is it 51? no 5
        is it 55? no 6
        is it 57? no 7
        is it 60? no 8
        is it 67? no 9
        is it 72? no 10
        is it 78? no 11
        is it 83? no 12
        is it 96? no 13
        50 not in the array
        return -1
        end
        
        //Binary search
        //looking for 72
        position = (array.length / 2)-1 (equals 6)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                                X
        is it 55?
        no
        smaller than 55?
        no
        must be bigger than 55

        position2 = ((position+1)+(array.length-1))/2 (equals 10)

        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                                                X
        is it 72?
        yes, found it
        72 was found in position 10 in the array
        return position2
        end
        

        //looking for 41
        position = (array.length / 2)-1 (equals 6)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                                X
        is it 55?
        no
        smaller than 55?
        yes
        
        position2 = (0 + (position-1))/2 (equals 2)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                X
        is it 30?
        no
        smaller than 30?
        no
        must be bigger than 30 (and in the range of array[0] to array[5])

        position3 = (position2+1)+(position-1)/2 (equals 4)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                        X
        is it 41?
        yes
        41 was found in position 4 in the array 
        return position3


        //looking for 50
        position = (array.length / 2)-1 (equals 6)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                                X
        is it 55?
        no
        smaller than 55?
        yes

        position2 = (0 + (position-1))/2 (equals 2)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                X
        is it 30?
        no
        smaller than 30?
        no
        must be bigger than 30

        position3 = (position2+1)+(position-1)/2 (equals 4)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                        X
        is it 41?
        no
        smaller than 41?
        no
        must be larger than 41

        position4 = (position3+1)+(position-1)/2 (equals 5)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                        X

        is it 41?
        no
        is it smaller than 41?
        no
        must be bigger than 41
        
        position5 = (position4+1)+(position-1)/2  (equals 6)
        23, 27, 30, 34, 41, 51, 55, 57, 60, 67, 72, 78, 83, 96
                            X
        is it 51?
        no
        is it smaller than 51?
        yes
        return -1


        