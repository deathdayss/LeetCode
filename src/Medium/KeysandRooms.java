package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KeysandRooms {
    int length = 0;
    public boolean helper(List<List<Integer>> rooms, List<Boolean> isClosed, List<Integer> keys, int openedDoor) {
        if (keys.isEmpty()) {
            if (openedDoor == length) {
                return true;
            } else {
                return false;
            }
        } else {
            List<Integer> newKeys = new ArrayList<>();
            int nextOpened = 0;
            for (int key : keys) {
                if (key < length && isClosed.get(key)) {
                    isClosed.set(key, false);
                    newKeys.addAll(rooms.get(key));
                    nextOpened++;
                }
            }
            return helper(rooms, isClosed, newKeys, openedDoor + nextOpened);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        List<Boolean> isClosed = new ArrayList<>();
        isClosed.add(false);
        length = rooms.size();
        for(int i = 1; i < length; i++) {
            isClosed.add(true);
        }
        return helper(rooms, isClosed, rooms.get(0), 1);
    }
}
